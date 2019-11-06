package com.youjiuye.compare.controller;

import com.youjiuye.compare.bean.BenchMarking;
import com.youjiuye.compare.service.BenchMarkingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/bench")
public class BenchMarkingController {

	@Autowired
	private BenchMarkingService benchMarkingService;

	@ResponseBody
	@RequestMapping(value = "/selectChart/{year}",method = RequestMethod.GET)
	public List<BenchMarking> selectChart(@PathVariable("year") Integer year){

		List<BenchMarking> benchMarkings = benchMarkingService.selectChart(year);
		return benchMarkings;
	}

	@RequestMapping(value = "/insert",method = RequestMethod.POST)
	public String insertBench(BenchMarking benchMarking){

		benchMarkingService.insertBench(benchMarking);
		return "redirect:/indexvalue-base.jsp";
	}
}
