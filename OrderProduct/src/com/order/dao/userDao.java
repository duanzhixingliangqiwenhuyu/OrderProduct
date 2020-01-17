package com.order.dao;

import java.util.List;

import com.order.entity.User;

public interface userDao {
	
	/* 保存用户 */
	public void saveUser(User user);
	
	/* 查询用户 */
	public User queryUser(User user);
	
	/* 通过Id查找用户 */
	public User findUserById(Integer id);
	
	/* 查询用户密码 */
	public User findUserPassword(String userName,String email);
	
	/* 查询用户密码 */
	public List<User> findUser(List<Object> params,String hql);
	
	/* 更新用户信息 */
	public void updateUser(User user);
	
	/* 通过用户名查找用户 */
	public User findUserByUserName(String userName);
}
