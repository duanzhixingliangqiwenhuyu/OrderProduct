package com.table.service;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.table.dao.insertOrderReservarDao;

@Service
@Transactional(readOnly=false)
public class reservarFormService {
	@Resource
	private insertOrderReservarDao insertOrderReservarDao;
	
	//向数据库中插入预约表单
	public void insertdb_reservar(String phone_number,int people_number,String estimate_time,int tableNumber) {
		insertOrderReservarDao.insert_order_reservar(phone_number,people_number,estimate_time,tableNumber);
	}
	
}
