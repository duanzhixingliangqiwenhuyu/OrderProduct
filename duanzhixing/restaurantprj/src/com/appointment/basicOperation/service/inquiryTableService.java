package com.appointment.basicOperation.service;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.appointment.basicOperation.dao.getTableStatusSetDao;
import com.entity.table;

/**
 *@desc:该service用于得到根据桌子状态查询出的结果的集合
 *@param:
 *@return:
 *@author XX
 *@date:2020年2月15日下午4:56:50
 */
@Service
@Transactional(readOnly=false)

public class inquiryTableService {

	@Resource getTableStatusSetDao gts;
	
	//调用dao查询空余桌子集合
	public List<table> getFreeTable(int tb_num){
		return gts.getTableSet(0,tb_num);
		
	}
	
	//调用dao得到已占用的桌子的集合
	public List<table> getUsingTable(int tb_num){
		return gts.getTableSet(1,tb_num);
		
	}
}
