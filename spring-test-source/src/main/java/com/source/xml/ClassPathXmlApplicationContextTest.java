package com.source.xml;

import com.source.xml.service.EmailService;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.GenericApplicationContext;
import org.springframework.core.metrics.ApplicationStartup;
import org.springframework.core.metrics.StartupStep;

import java.util.function.Supplier;

/**
 * @author huangfukexing
 * @date 2024/3/6 18:02
 */
public class ClassPathXmlApplicationContextTest {
	public static void main(String[] args) {

		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext();
		context.setConfigLocation("springBean.xml");
		context.setAllowCircularReferences(true);
		context.setAllowBeanDefinitionOverriding(true);

		context.refresh();
		EmailService emailService = context.getBean(EmailService.class);
		emailService.sendEmail("123");
	}
}
