package com.youjiuye.cust.service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.youjiuye.cust.bean.Customer;
import com.youjiuye.cust.bean.CustomerExample;
import com.youjiuye.cust.mapper.CustomerMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

@Service
public class CustomerServiceImp implements CustomerService {

	@Autowired
	private CustomerMapper customerMapper;
	@Override
	public void insertCustomer(Customer customer) {
		customer.setAddtime(new Date());
		customerMapper.insert(customer);
	}

	@Override
	public List<Customer> showCustomer() {
		CustomerExample customerExample = new CustomerExample();

		//PageHelper.startPage(1,3);
		List<Customer> list = customerMapper.selectByExample(customerExample);

		//PageInfo<Customer> pageInfo = new PageInfo<>(list,1);
		return list;
	}

	@Override
	public Customer detailCustomer(Integer id) {
		Customer customer = customerMapper.selectByPrimaryKey(id);
		return customer;
	}

	@Override
	public void updateCustomer(Customer customer) {
		customerMapper.updateByPrimaryKeySelective(customer);
	}

	@Override
	public boolean batchDelete(Integer[] ids) {
		List<Integer> list = Arrays.asList(ids);
		CustomerExample example = new CustomerExample();
		CustomerExample.Criteria criteria = example.createCriteria();
		criteria.andIdIn(list);

		int row = customerMapper.deleteByExample(example);

		if (row > 0){
			return true;
		}
		return false;
	}

	@Override
	public List<Customer> search(Integer cid, String keyword, Integer orderby) {
		CustomerExample example = new CustomerExample();
		CustomerExample.Criteria criteria = example.createCriteria();
		if(cid == 0){
			criteria.andComnameLike("%" + keyword + "%");
			CustomerExample.Criteria criteria1 = example.createCriteria();
			criteria1.andCompanypersonLike("%" + keyword + "%");
			example.or(criteria1);
		}else if(cid == 1){
			criteria.andComnameLike("%" + keyword + "%");
		}else{
			criteria.andCompanypersonLike("%" + keyword + "%");
		}
		if(orderby == 1){
			example.setOrderByClause("id desc");
		}
		List<Customer> list = customerMapper.selectByExample(example);
		return list;
	}

	@Override
	public void batchInsert(List<Customer> customers) {
		for(Customer customer : customers){
			customerMapper.insert(customer);
		}
	}
}
