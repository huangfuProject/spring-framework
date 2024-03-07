package com.source.ann;

import com.source.ann.config.AppConfig;
import com.source.ann.service.EmailService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author huangfukexing
 * @date 2024/3/7 16:05
 */
public class AnnotationConfigApplicationContextTest {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
		context.register(AppConfig.class);

		context.refresh();
		EmailService bean = context.getBean(EmailService.class);
		bean.sendEmail("555");
	}
}
