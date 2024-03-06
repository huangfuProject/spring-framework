package com.source.xml;

import com.source.xml.service.EmailService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author huangfukexing
 * @date 2024/3/6 18:02
 */
public class ClassPathXmlApplicationContextTest {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("springBean.xml");
		EmailService emailService = context.getBean(EmailService.class);
		emailService.sendEmail("123");
	}
}
