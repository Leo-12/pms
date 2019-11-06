package com.youjiuye.info.controller;

import com.youjiuye.common.ResultEntity;
import com.youjiuye.info.bean.Email;
import com.youjiuye.info.service.EmailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/email")
public class EmailController {

	@Autowired
	private EmailService emailService;

	@ResponseBody
	@RequestMapping(value = "/insert",method = RequestMethod.POST)
	public ResultEntity insertEmail(Email email){
		emailService.insertEmail(email);
		return ResultEntity.success();
	}
}
