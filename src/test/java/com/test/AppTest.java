package com.test;

import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.mail.javamail.JavaMailSenderImpl;
import org.springframework.mail.javamail.MimeMessageHelper;

import javax.mail.MessagingException;
import javax.mail.internet.MimeMessage;

public class AppTest {

	public static void main(String args[]){
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beans-quartz.xml");
	}

	@Test
	public void test01() throws MessagingException {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beans-email.xml");
		JavaMailSenderImpl bean = context.getBean(JavaMailSenderImpl.class);

		//邮件对象
		MimeMessage mimeMessage = bean.createMimeMessage();
		MimeMessageHelper helper = new MimeMessageHelper(mimeMessage);

		helper.setFrom("YY729265445@163.com");
		helper.setTo("xueziye10042@163.com");
		helper.setSubject("这是0708班的邮件测试");
		helper.setText("123abc");

		//发送邮件
		bean.send(mimeMessage);

		System.out.println("EMAIL PASS");
	}
}
