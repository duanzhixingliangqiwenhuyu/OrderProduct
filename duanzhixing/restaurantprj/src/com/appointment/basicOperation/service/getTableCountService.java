package com.appointment.basicOperation.service;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.appointment.basicOperation.dao.inquorySumTableCount;

/**
 *@desc:该service用于获取大小桌的总个数用于创建分配队列的数组
 *@param:tb_num 桌子能容纳的客人数
 *@return:
 *@author XX
 *@date:2020年2月16日下午8:23:55
 */
@Service
@Transactional(readOnly = false)
public class getTableCountService {
	
	@Resource inquorySumTableCount istc;
	//大桌
	public int getTableCount(int tb_num) {
		
		if (tb_num==4) {
			return istc.getTableNumber(4);
		}else {
			return istc.getTableNumber(8);
		}
		
		 
	}
	
}
