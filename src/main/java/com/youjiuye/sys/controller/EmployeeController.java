package com.youjiuye.sys.controller;

import com.youjiuye.common.ResultEntity;
import com.youjiuye.sys.bean.Employee;
import com.youjiuye.sys.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import javax.servlet.http.HttpSession;
import java.util.List;

@Controller
@RequestMapping("/emp")
public class EmployeeController {

	@Autowired
	private EmployeeService employeeService;

	@ResponseBody
	@RequestMapping(value = "/recipient",method = RequestMethod.GET)
	public ResultEntity getRecipient(HttpSession session){
		Employee employee = (Employee)session.getAttribute("loginUser");
		Integer eid = employee.getEid();

		List<Employee> list = employeeService.getRecipient(eid);

		return ResultEntity.success().put("list",list);
	}

	@RequestMapping(value = "/logout",method = RequestMethod.GET)
	public String logout(HttpSession session){
		session.invalidate();
		return "redirect:/login.jsp";
	}

	@RequestMapping(value = "/login",method = RequestMethod.POST)
	public String login(Employee employee, String code, HttpSession session, RedirectAttributes attributes){
		String validateCode = (String)session.getAttribute("validateCode");
		if(code.equalsIgnoreCase(validateCode)){
			employee = employeeService.login(employee);
			if (employee!=null){
				session.setAttribute("loginUser",employee);
				return "redirect:/index.jsp";
			}else{
				attributes.addFlashAttribute("error","用户名或者密码错误");
				return "redirect:/login";
			}
		}
		attributes.addFlashAttribute("error","验证码错误");
		return "redirect:/login";
	}

	@ResponseBody
	@RequestMapping(value = "/leader",method = RequestMethod.GET)
	public List<Employee> getEmployeeList(){
		return employeeService.getEmployeeList();
	}

}


