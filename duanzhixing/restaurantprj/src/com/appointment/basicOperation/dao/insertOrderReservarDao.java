package com.appointment.basicOperation.dao;

import org.springframework.stereotype.Repository;

import com.entity.order;

import com.util.BaseDao;
 

/**
 *@desc:插入数据库订单表操作（根据桌号判断订单状态，桌号为0，等位）
 *@param:人数，预估时间，桌子号，用户电话,订单状态
 *@return:
 *@author XX
 *@date:2020年1月29日下午3:08:17
 */
@Repository
public class insertOrderReservarDao extends BaseDao<order>{
	public void insert_order_reservar(String phone_number,int people_number,String estimate_time,int tableNumber) {
		int order_status  = 0;
		if(tableNumber== 100) {
			//订单状态为等位
		}else {
			//订单状态为已就位
			order_status = 1;
		}
		int i = insert("insert into myorder(order_man_num,order_predict,tb_id,user_phone,order_status) values(?,?,?,?,?)",people_number,estimate_time,tableNumber,phone_number,order_status);
//		System.out.println(i);
	}

}
