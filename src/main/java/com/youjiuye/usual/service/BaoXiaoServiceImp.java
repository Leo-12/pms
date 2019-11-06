package com.youjiuye.usual.service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.youjiuye.common.MapCommon;
import com.youjiuye.usual.bean.BaoXiao;
import com.youjiuye.usual.bean.BaoXiaoExample;
import com.youjiuye.usual.mapper.BaoXiaoMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class BaoXiaoServiceImp implements BaoXiaoService {

	@Autowired
	private BaoXiaoMapper baoXiaoMapper;

	@Override
	public void insertInfo(BaoXiao baoXiao) {
		String bxid = UUID.randomUUID().toString().replaceAll("-","");
		baoXiao.setBxid(bxid);

		baoXiaoMapper.insertSelective(baoXiao);
	}

	@Override
	public PageInfo<BaoXiao> showInfo(Integer eid, Integer pageNum, Map<String, Object> parameterMap) {
		BaoXiaoExample example = new BaoXiaoExample();
		BaoXiaoExample.Criteria criteria = example.createCriteria();
		criteria.andEmpFkEqualTo(eid);

		Map<String,String> mybatisMap = MapCommon.parseParmeterMaptoMybatisMap(parameterMap);
		String status = mybatisMap.get("status");
		if (status != null && status != ""){
			criteria.andBxstatusEqualTo(Integer.parseInt(status));
		}
		String keyword = mybatisMap.get("keyword");
		if (keyword != null && keyword != ""){
			criteria.andBxremarkLike(keyword);
		}

		PageHelper.startPage(pageNum,3);
		List<BaoXiao> list = baoXiaoMapper.selectByExample(example);
		PageInfo<BaoXiao> page = new PageInfo<BaoXiao>(list,5);
		return page;
	}

}
