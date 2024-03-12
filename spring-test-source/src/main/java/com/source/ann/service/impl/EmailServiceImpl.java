package com.source.ann.service.impl;

import com.source.ann.service.EmailService;
import com.source.ann.service.UserService;
import org.springframework.stereotype.Service;

/**
 * 邮箱服务的实现
 *
 * @author huangfukexing
 * @date 2024/3/6 18:07
 */
@Service
public class EmailServiceImpl implements EmailService {

	private final UserService userService;

    public EmailServiceImpl(UserService userService) {
        this.userService = userService;
    }

    @Override
	public void sendEmail(String uId) {
		String userName = userService.getUserName(uId);
		System.out.println("给用户【" + userName + "】发送邮件！");
	}
}
