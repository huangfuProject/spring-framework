package com.source.ann.service;

/**
 * 用户服务
 *
 * @author huangfukexing
 * @date 2024/3/6 18:02
 */
public interface UserService {

	/**
	 * 获取用户名称
	 *
	 * @param uId 用户id
	 * @return 用户名
	 */
	String getUserName(String uId);
}
