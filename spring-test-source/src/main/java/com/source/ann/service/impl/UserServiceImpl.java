package com.source.ann.service.impl;

import com.source.ann.service.UserService;

/**
 * 用户服务实现
 *
 * @author huangfukexing
 * @date 2024/3/6 18:02
 */
public class UserServiceImpl implements UserService {
	@Override
	public String getUserName(String uId) {
		return "皇甫" + uId;
	}
}
