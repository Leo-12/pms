package com.youjiuye.info.service;

import com.youjiuye.info.bean.Email;
import com.youjiuye.info.mapper.EmailMapper;
import org.springframework.stereotype.Service;

@Service
public class EmailServiceImp implements EmailService {

	private EmailMapper emailMapper;

	@Override
	public void insertEmail(Email email) {
		emailMapper.insert(email);
	}
}
