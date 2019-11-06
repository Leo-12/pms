package com.youjiuye.sys.service;

import com.youjiuye.sys.bean.Employee;

import java.util.List;

public interface EmployeeService {

	List<Employee> getEmployeeList();

	Employee login(Employee employee);

	List<Employee> getRecipient(Integer eid);

}
