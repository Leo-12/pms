package com.youjiuye.sys.service;

import com.youjiuye.sys.bean.Sources;

import java.util.List;

public interface SourcesService {
	List<Sources> selectSourcesByPid(int pid);

	void insertSources(Sources sources);

	Sources selectSource(Integer id);

	void updateSources(Sources sources);

	void deleteSource(Integer id);
}
