package com.youjiuye.sys.mapper;

import java.util.List;

import com.youjiuye.sys.bean.Sources;
import com.youjiuye.sys.bean.SourcesExample;
import org.apache.ibatis.annotations.Param;

public interface SourcesMapper {
    int countByExample(SourcesExample example);

    int deleteByExample(SourcesExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Sources record);

    int insertSelective(Sources record);

    List<Sources> selectByExample(SourcesExample example);

    Sources selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Sources record, @Param("example") SourcesExample example);

    int updateByExample(@Param("record") Sources record, @Param("example") SourcesExample example);

    int updateByPrimaryKeySelective(Sources record);

    int updateByPrimaryKey(Sources record);
}