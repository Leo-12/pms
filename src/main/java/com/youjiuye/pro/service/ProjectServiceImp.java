package com.youjiuye.pro.service;

import com.youjiuye.cust.bean.Customer;
import com.youjiuye.cust.mapper.CustomerMapper;
import com.youjiuye.pro.bean.Project;
import com.youjiuye.pro.bean.ProjectExample;
import com.youjiuye.pro.mapper.ProjectMapper;
import com.youjiuye.sys.bean.Employee;
import com.youjiuye.sys.mapper.EmployeeMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Service
public class ProjectServiceImp implements ProjectService {

	@Autowired
	private ProjectMapper projectMapper;
	@Autowired
	private CustomerMapper customerMapper;
	@Autowired
	private EmployeeMapper employeeMapper;

	@Override
	public void insertPro(Project project) {

		projectMapper.insert(project);
	}

	@Override
	public List<Project> showPro() {
		ProjectExample example = new ProjectExample();
		List<Project> projects = projectMapper.selectByExample(example);
		for(Project project : projects){
			Integer comname = project.getComname();
			Customer customer = customerMapper.selectByPrimaryKey(comname);
			project.setCustomer(customer);

			Integer empFk = project.getEmpFk();
			Employee employee = employeeMapper.selectByPrimaryKey(empFk);
			project.setEmployee(employee);
		}
		return projects;
	}

	@Override
	public Project lookPro(Integer pid) {
		Project project = projectMapper.selectByPrimaryKey(pid);

		Integer comname = project.getComname();
		Customer customer = customerMapper.selectByPrimaryKey(comname);
		project.setCustomer(customer);

		Integer empFk = project.getEmpFk();
		Employee employee = employeeMapper.selectByPrimaryKey(empFk);
		project.setEmployee(employee);
		return project;
	}

	@Override
	public Project editPro(Integer pid) {
		Project project = projectMapper.selectByPrimaryKey(pid);

		Integer comname = project.getComname();
		Customer customer = customerMapper.selectByPrimaryKey(comname);
		project.setCustomer(customer);

		Integer empFk = project.getEmpFk();
		Employee employee = employeeMapper.selectByPrimaryKey(empFk);
		project.setEmployee(employee);

		return project;
	}

	@Override
	public void updatePro(Project project) {

		projectMapper.updateByPrimaryKeySelective(project);
	}

	@Override
	public boolean deletePro(Integer[] ids) {
		List<Integer> list = Arrays.asList(ids);
		ProjectExample example = new ProjectExample();
		ProjectExample.Criteria criteria = example.createCriteria();
		criteria.andPidIn(list);
		int row = projectMapper.deleteByExample(example);
		if (row > 0){
			return true;
		}
			return false;
	}

	@Override
	public List<Project> searchPro(Integer cid,String keyword,Integer orderby) {
		List<Project> projects = projectMapper.selectSearch(cid,keyword,orderby);
		return projects;
	}

}
