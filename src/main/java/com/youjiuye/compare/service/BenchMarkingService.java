package com.youjiuye.compare.service;

import com.youjiuye.compare.bean.BenchMarking;

import java.util.List;

public interface BenchMarkingService {
	void insertBench(BenchMarking benchMarking);

	List<BenchMarking> selectChart(Integer year);
}
