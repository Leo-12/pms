package com.youjiuye.anal.service;

import com.youjiuye.anal.bean.Analysis;
import com.youjiuye.anal.mapper.AnalysisMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;

@Service
public class AnalyServiceImp implements AnalyService {

	@Autowired
	private AnalysisMapper analysisMapper;

	@Override
	public void insertAnal(Analysis analysis) {

		analysis.setAddtime(new Date());
		analysisMapper.insertSelective(analysis);
	}
}
