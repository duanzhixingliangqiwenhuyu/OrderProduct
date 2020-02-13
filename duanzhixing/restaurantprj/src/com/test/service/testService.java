package com.test.service;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.entity.user;
import com.test.dao.testDao;

@Service
@Transactional(readOnly=true)
public class testService {
	@Resource
	private testDao testDao;
	
	public user findUser(String user_phone) {
		return testDao.selectUser(user_phone);
	}
}
