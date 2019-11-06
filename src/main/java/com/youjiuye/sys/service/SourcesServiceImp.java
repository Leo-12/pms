package com.youjiuye.sys.service;

import com.youjiuye.sys.bean.Sources;
import com.youjiuye.sys.bean.SourcesExample;
import com.youjiuye.sys.mapper.SourcesMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SourcesServiceImp implements SourcesService {

	@Autowired
	private SourcesMapper sourcesMapper;

	@Override
	public List<Sources> selectSourcesByPid(int pid) {
		SourcesExample example = new SourcesExample();
		SourcesExample.Criteria criteria = example.createCriteria();
		criteria.andPidEqualTo(pid);
		List<Sources> sources = sourcesMapper.selectByExample(example);
		return sources;
	}

	@Override
	public void insertSources(Sources sources) {
		sourcesMapper.insert(sources);
	}

	@Override
	public Sources selectSource(Integer id) {
		Sources sources = sourcesMapper.selectByPrimaryKey(id);
		return sources;
	}

	@Override
	public void updateSources(Sources sources) {
		sourcesMapper.updateByPrimaryKeySelective(sources);
	}

	@Override
	public void deleteSource(Integer id) {
		sourcesMapper.deleteByPrimaryKey(id);
	}
}
