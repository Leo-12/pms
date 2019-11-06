package com.youjiuye.sys.mapper;

import org.apache.ibatis.annotations.Param;

public interface RoleSourceMapper {
	void insert(@Param("rid") int roleId,@Param("sid") int sid);
}
