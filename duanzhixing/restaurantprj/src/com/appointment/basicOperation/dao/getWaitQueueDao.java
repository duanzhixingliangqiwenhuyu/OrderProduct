package com.appointment.basicOperation.dao;

import java.util.LinkedList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.entity.order;
import com.util.BaseDao;

/**
 *@desc:该dao用于查询订单状态为0即在等待的满足要求（大小桌）的队列
 *@param:tb_num 客户人数
 *@return: 等候队列
 *@author XX
 *@date:2020年2月16日下午8:54:40
 */
@Repository
public class getWaitQueueDao extends BaseDao<order>{
	
	public List<order> getWaitQueue(int tb_num){
		List<order> list = new LinkedList<order>();
		if(tb_num<=4) {
			list = find("from order ord where ord.order_status=0 and ord.order_man_num<=4");
		}else {
			list = find("from order ord where ord.order_status=0 and ord.order_man_num>4");
		}
		return list;
		
		
	}
}
