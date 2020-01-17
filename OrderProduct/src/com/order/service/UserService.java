package com.order.service;

import com.order.entity.User;

public interface UserService {
	/** 获得用户id */
	public int getUserId(String userName);

	/** 插入用户 */
	public void insertUser(User user);

	/** 验证登录用户（用户名和密码是否填写正确） */
	public boolean login(String userName,String password);
	
	/** 通过用户名查询用户id */
	public int findIdByUserName(User user);
}
