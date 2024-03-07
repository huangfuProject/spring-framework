package com.source.ann.config;

import com.source.ann.service.EmailService;
import com.source.ann.service.UserService;
import com.source.ann.service.impl.EmailServiceImpl;
import com.source.ann.service.impl.UserServiceImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author huangfukexing
 * @date 2024/3/7 16:06
 */
@Configuration
public class AppConfig {

	@Bean
	public UserService userService() {
		return new UserServiceImpl();
	}

	@Bean
	public EmailService emailService(UserService userService) {
		return new EmailServiceImpl(userService);
	}
}
