package com.youjiuye.pro.controller;

import com.youjiuye.pro.bean.Project;
import com.youjiuye.pro.service.ProjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import java.util.HashMap;
import java.util.List;
import java.util.Map;


@Controller
@RequestMapping("/pro")
public class ProjectController {

	@Autowired
	private ProjectService projectService;

	@ResponseBody
	@RequestMapping(value = "/showjson",method = RequestMethod.GET)
	public List<Project> showProJson(){
		List<Project> projects = projectService.showPro();
		return projects;
	}

	@RequestMapping(value="/search",method = RequestMethod.GET)
	public ModelAndView searchPro(Integer cid,String keyword,Integer orderby){
		ModelAndView modelAndView = new ModelAndView("project-base");
		List<Project> list = projectService.searchPro(cid,keyword,orderby);
		modelAndView.addObject("list",list);
		return modelAndView;
	}

	@ResponseBody
	@RequestMapping(value = "/delete/{ids}",method = RequestMethod.DELETE)
	public Map<String,Object> deletePro(@PathVariable("ids") Integer[] ids){
		Map<String,Object> map = new HashMap<String,Object>();
		boolean result = projectService.deletePro(ids);
		if (result){
			map.put("statusCode",200);
			map.put("message","删除成功");
		}else{
			map.put("statusCode",500);
			map.put("message","删除失败");
		}
		return map;
	}

	@RequestMapping(value="/update",method = RequestMethod.PUT)
	public String updatePro(Project project){

		projectService.updatePro(project);
		return "redirect:/pro/show";
	}

	@RequestMapping(value="/edit/{pid}",method = RequestMethod.GET)
	public String editPro(@PathVariable("pid") Integer pid, Map<String,Object> map){
		Project project = projectService.editPro(pid);
		map.put("project",project);
		return "project-base-edit";
	}

	@RequestMapping(value="/look/{pid}",method = RequestMethod.GET)
	public String lookPro(@PathVariable("pid") Integer pid, Map<String,Object> map){
		Project project = projectService.lookPro(pid);
		map.put("project",project);
		return "project-base-look";
	}

	@RequestMapping(value="/show",method = RequestMethod.GET)
	public ModelAndView showPro(){
		ModelAndView modelAndView = new ModelAndView("project-base");
		List<Project> list = projectService.showPro();
		modelAndView.addObject("list",list);
		return modelAndView;
	}

	@RequestMapping(value="/insert",method = RequestMethod.POST)
	public String insertPro(Project project){

		projectService.insertPro(project);
		return "redirect:/pro/show";
	}

}
