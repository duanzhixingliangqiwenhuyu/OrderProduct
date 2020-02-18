package com.appointment.basicOperation.service;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.appointment.basicOperation.dao.getWaitQueueDao;
import com.entity.order;

/**
 *@desc:该service用于调用获得等待队列的dao
 *@param:tb_num
 *@return:等待队列，暂时用list存储
 *@author XX
 *@date:2020年2月16日下午8:59:36
 */
@Service
@Transactional(readOnly = false)
public class getWaitQueueService {

	@Resource getWaitQueueDao gwqd;
	public List<order> getWaitQueue(int tb_num){
		return gwqd.getWaitQueue(tb_num);
	}
}
