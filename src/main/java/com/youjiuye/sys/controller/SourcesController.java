package com.youjiuye.sys.controller;

import com.youjiuye.common.ResultEntity;
import com.youjiuye.sys.bean.Sources;
import com.youjiuye.sys.service.SourcesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
@RequestMapping("/sources")
public class SourcesController {

	@Autowired
	private SourcesService sourcesService;

	@ResponseBody
	@RequestMapping(value = "/deletesource",method = RequestMethod.DELETE)
	public ResultEntity deleteSource(Integer id){

		sourcesService.deleteSource(id);
		return ResultEntity.success();
	}

	@RequestMapping(value = "/updatesource",method = RequestMethod.PUT)
	public String updateSource(Sources sources){
		sourcesService.updateSources(sources);
		return "redirect:/pm.jsp";
	}

	@RequestMapping(value = "/selectsource/{id}",method = RequestMethod.GET)
	public ModelAndView selectSource(@PathVariable("id") Integer id){
		ModelAndView modelAndView = new ModelAndView("pm-edit");
		Sources sources = sourcesService.selectSource(id);
		modelAndView.addObject("sources",sources);
		return modelAndView;
	}

	@RequestMapping(value = "/insert",method = RequestMethod.POST)
	public String insertSources(Sources sources){

		sourcesService.insertSources(sources);
		return "redirect:/pm.jsp";
	}

	@ResponseBody
	@RequestMapping(value = "/select",method = RequestMethod.GET)
	public List<Sources> selectSources(){

		List<Sources> list = sourcesService.selectSourcesByPid(0);
		queryChildren(list.get(0));
		return list;
	}

	private void queryChildren(Sources source){
		Integer id = source.getId();
		List<Sources> sources = sourcesService.selectSourcesByPid(id);
		for (Sources sources1 : sources) {
			queryChildren(sources1);
		}
		source.setChildren(sources);
	}
}
