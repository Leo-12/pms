package com.youjiuye.pro.mapper;


import java.util.List;

import com.youjiuye.pro.bean.Project;
import com.youjiuye.pro.bean.ProjectExample;
import org.apache.ibatis.annotations.Param;

public interface ProjectMapper {
    int countByExample(ProjectExample example);

    int deleteByExample(ProjectExample example);

    int deleteByPrimaryKey(Integer pid);

    int insert(Project record);

    int insertSelective(Project record);

    List<Project> selectByExample(ProjectExample example);

    Project selectByPrimaryKey(Integer pid);

    int updateByExampleSelective(@Param("record") Project record, @Param("example") ProjectExample example);

    int updateByExample(@Param("record") Project record, @Param("example") ProjectExample example);

    int updateByPrimaryKeySelective(Project record);

    int updateByPrimaryKey(Project record);

	List<Project> selectSearch(@Param("cid") Integer cid,@Param("keyword") String keyword,@Param("orderby") Integer orderby);
}