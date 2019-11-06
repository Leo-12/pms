package com.youjiuye.anal.controller;

import com.youjiuye.anal.bean.Analysis;
import com.youjiuye.anal.service.AnalyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/anal")
public class AnalysisController {

	@Autowired
	private AnalyService analyService;

	@RequestMapping(value = "/insert",method = RequestMethod.POST)
	public String insertAnal(Analysis analysis){
		analyService.insertAnal(analysis);
		return "redirect:/project-need.jsp";
	}
}
