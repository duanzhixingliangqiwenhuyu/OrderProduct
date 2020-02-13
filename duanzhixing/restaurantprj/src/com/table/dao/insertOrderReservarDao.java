package com.table.dao;

import org.springframework.stereotype.Repository;

import com.entity.order;
import com.entity.table;
import com.entity.user;
import com.util.BaseDao;
 

/**
 *@desc:插入数据库操作
 *@param:人数，预估时间，桌子号，用户电话
 *@return:
 *@author XX
 *@date:2020年1月29日下午3:08:17
 */
@Repository
public class insertOrderReservarDao extends BaseDao<order>{
	public void insert_order_reservar(String phone_number,int people_number,String estimate_time,int tableNumber) {

		int i = insert("insert into myorder(order_man_num,order_predict,tb_id,user_phone) values(?,?,?,?)",people_number,estimate_time,tableNumber,phone_number);
		System.out.println(i);
	}

}
