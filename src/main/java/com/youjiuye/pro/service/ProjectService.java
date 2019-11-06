package com.youjiuye.pro.service;

import com.youjiuye.pro.bean.Project;

import java.util.List;


public interface ProjectService {

	void insertPro(Project project);

	List<Project> showPro();

	Project lookPro(Integer pid);

	Project editPro(Integer pid);

	void updatePro(Project project);

	boolean deletePro(Integer[] ids);

	List<Project> searchPro(Integer cid,String keyword,Integer orderby);
}
