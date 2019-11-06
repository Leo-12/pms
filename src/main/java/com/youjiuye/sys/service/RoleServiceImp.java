package com.youjiuye.sys.service;

import com.youjiuye.sys.bean.Role;
import com.youjiuye.sys.mapper.RoleMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RoleServiceImp implements RoleService {

	@Autowired
	private RoleMapper roleMapper;

	@Override
	public int insertRole(Role role) {
		roleMapper.insertRole(role);
		Integer roleid = role.getRoleid();
		return roleid;
	}
}
