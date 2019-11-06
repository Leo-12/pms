package com.youjiuye.usual.service;

import com.github.pagehelper.PageInfo;
import com.youjiuye.usual.bean.BaoXiao;

import java.util.Map;

public interface BaoXiaoService {
	void insertInfo(BaoXiao baoXiao);

	PageInfo<BaoXiao> showInfo(Integer eid, Integer pageNum, Map<String, Object> parameterMap);
}
