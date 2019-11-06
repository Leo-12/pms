package com.youjiuye.compare.service;

import com.youjiuye.compare.bean.BenchMarking;
import com.youjiuye.compare.mapper.BenchMarkingMapping;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BenchMarkingServiceImp implements BenchMarkingService {

	@Autowired
	private BenchMarkingMapping benchMarkingMapping;

	@Override
	public void insertBench(BenchMarking benchMarking) {

		benchMarkingMapping.insertBench(benchMarking);
	}

	@Override
	public List<BenchMarking> selectChart(Integer year) {

		List<BenchMarking> benchMarkings = benchMarkingMapping.selectChart(year);
		return benchMarkings;
	}
}
