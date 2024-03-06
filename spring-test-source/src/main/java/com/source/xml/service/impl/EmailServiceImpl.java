package com.source.xml.service.impl;

import com.source.xml.service.EmailService;
import com.source.xml.service.UserService;

/**
 * 邮箱服务的实现
 *
 * @author huangfukexing
 * @date 2024/3/6 18:07
 */
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
