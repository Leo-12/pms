package com.youjiuye.sys.service;

import com.youjiuye.sys.bean.Employee;
import com.youjiuye.sys.bean.EmployeeExample;
import com.youjiuye.sys.mapper.EmployeeMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeServiceImp implements EmployeeService {

	@Autowired
	private EmployeeMapper employeeMapper;

	@Override
	public List<Employee> getEmployeeList() {

		EmployeeExample example = new EmployeeExample();
		EmployeeExample.Criteria criteria = example.createCriteria();
		criteria.andPFkEqualTo(4);
		List<Employee> employees = employeeMapper.selectByExample(example);
		return employees;
	}

	@Override
	public Employee login(Employee employee) {

		EmployeeExample example = new EmployeeExample();
		EmployeeExample.Criteria criteria = example.createCriteria();
		criteria.andUsernameEqualTo(employee.getUsername());
		criteria.andPasswordEqualTo(employee.getPassword());
		List<Employee> employees = employeeMapper.selectByExample(example);
		if (employees != null && employees.size() > 0){
			employee = employees.get(0);
			return employee;
		}
		return null;
	}

	@Override
	public List<Employee> getRecipient(Integer eid) {

		List<Employee> list = employeeMapper.selectRecipient(eid);
		return list;
	}

}
