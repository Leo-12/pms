package com.youjiuye.sys.controller;

import com.youjiuye.common.ResultEntity;
import com.youjiuye.sys.bean.Role;
import com.youjiuye.sys.bean.RoleSource;
import com.youjiuye.sys.service.RoleService;
import com.youjiuye.sys.service.RoleSourceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/role")
public class RoleController {

	@Autowired
	private RoleService roleService;
	@Autowired
	private RoleSourceService roleSourceService;

	@ResponseBody
	@RequestMapping(value = "/insert",method = RequestMethod.POST)
	public ResultEntity insertRole(Role role, String ids){

		int roleId = roleService.insertRole(role);
		roleSourceService.insertRole(roleId,ids);
		return ResultEntity.success();
	}
}
