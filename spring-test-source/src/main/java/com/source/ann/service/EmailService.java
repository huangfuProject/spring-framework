package com.source.ann.service;

/**
 * 邮箱服务
 *
 * @author huangfukexing
 * @date 2024/3/6 18:06
 */
public interface EmailService {

	/**
	 * 根据uId给用户发送邮箱
	 *
	 * @param uId 用户的id
	 */
	void sendEmail(String uId);
}
