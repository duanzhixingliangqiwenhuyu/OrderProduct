package com.order.dao.impl;

import java.util.List;

import com.order.dao.userDao;
import com.order.entity.User;

/**
 * @author liang
 * @data 1/5 
 */
public class userDaoImpl implements userDao{

	/* 存储用户 */
	@Override
	public void saveUser(User user) {
		// TODO Auto-generated method stub
		
	}

	/* 查询用户 */
	@Override
	public User queryUser(User user) {
		// TODO Auto-generated method stub
		return null;
	}

	/* 通过Id查找用户 */
	@Override
	public User findUserById(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	/* 查找用户密码 */
	@Override
	public User findUserPassword(String userName, String email) {
		// TODO Auto-generated method stub
		return null;
	}

	/* 查询多个用户（实现待定） */
	@Override
	public List<User> findUser(List<Object> params, String hql) {
		// TODO Auto-generated method stub
		return null;
	}

	
	/* 更新用户 */
	@Override
	public void updateUser(User user) {
		// TODO Auto-generated method stub
		
	}

	/* 通过用户名查找用户 */
	@Override
	public User findUserByUserName(String userName) {
		// TODO Auto-generated method stub
		return null;
	}

}
