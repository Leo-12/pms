package com.youjiuye.cust.service;

import com.youjiuye.cust.bean.Customer;

import java.util.List;

public interface CustomerService {

	public void insertCustomer(Customer customer);

	List<Customer> showCustomer();

	Customer detailCustomer(Integer id);

	void updateCustomer(Customer customer);

	boolean batchDelete(Integer[] ids);

	List<Customer> search(Integer cid, String keyword, Integer orderby);

	void batchInsert(List<Customer> customers);
}
