package com.youjiuye.sys.service;

import com.youjiuye.sys.mapper.RoleSourceMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RoleSourceServiceImp implements RoleSourceService {

	@Autowired
	private RoleSourceMapper roleSourceMapper;

	@Override
	public void insertRole(int roleId, String ids) {
		String[] split = ids.split(",");
		for (String s : split){
			roleSourceMapper.insert(roleId,Integer.parseInt(s));
		}
	}
}
