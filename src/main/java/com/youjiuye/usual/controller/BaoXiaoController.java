package com.youjiuye.usual.controller;

import com.github.pagehelper.PageInfo;
import com.youjiuye.common.MapCommon;
import com.youjiuye.sys.bean.Employee;
import com.youjiuye.usual.bean.BaoXiao;
import com.youjiuye.usual.service.BaoXiaoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.util.WebUtils;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.List;
import java.util.Map;
import java.util.Set;

@Controller
@RequestMapping("/bx")
public class BaoXiaoController {

	@Autowired
	private BaoXiaoService baoXiaoService;

	@RequestMapping(value = "/show",method = RequestMethod.GET)
	public ModelAndView showInfo(HttpServletRequest request, HttpSession session, @RequestParam(value = "pageNum",defaultValue = "1") Integer pageNum ){
		Map<String, Object> parameterMap = WebUtils.getParametersStartingWith(request, "search_");
		String queryStr = MapCommon.parseparmeterMapToString(parameterMap);
		String requestURI = request.getRequestURI();
		Employee employee = (Employee) session.getAttribute("loginUser");
		Integer eid = employee.getEid();
		ModelAndView modelAndView = new ModelAndView("mybaoxiao-base");
		PageInfo<BaoXiao> page = baoXiaoService.showInfo(eid,pageNum,parameterMap);
		modelAndView.addObject("page",page);
		modelAndView.addObject("queryStr",queryStr);
		modelAndView.addObject("requestURI",requestURI);
		return modelAndView;
	}

	@RequestMapping(value = "/insert",method = RequestMethod.POST)
	public String insertInfo(BaoXiao baoXiao, HttpSession session){
		Employee employee = (Employee) session.getAttribute("loginUser");
		Integer eid = employee.getEid();
		baoXiao.setEmpFk(eid);
		baoXiaoService.insertInfo(baoXiao);
		return "redirect:/mybaoxiao-base.jsp";
	}
}
