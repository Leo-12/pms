package com.youjiuye.compare.mapper;

import com.youjiuye.compare.bean.BenchMarking;

import java.util.List;

public interface BenchMarkingMapping {
	void insertBench(BenchMarking benchMarking);

	List<BenchMarking> selectChart(Integer year);
}
