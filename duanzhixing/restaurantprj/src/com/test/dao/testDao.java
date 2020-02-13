package com.test.dao;


import org.springframework.stereotype.Repository;

import com.entity.user;
import com.util.BaseDao;
@Repository
public class testDao extends BaseDao<user>{
	public user selectUser(String user_phone) {
		
		return get(user.class,user_phone);
	}
}
