package com.appointment.basicOperation.dao;

import org.springframework.stereotype.Repository;

import com.entity.order;
import com.entity.table;
import com.util.BaseDao;

/**
 *@desc:该dao用于获取桌子总数且区分大小桌
 *@param:
 *@return:
 *@author XX
 *@date:2020年2月16日下午4:56:32
 */
@Repository
public class inquorySumTableCount extends BaseDao<table> {
	
	public int getTableNumber(int tb) {
		
		try {
			int cou = (int) findCount("select count(*) from table t where t.tb_num = ?",tb);
			return cou;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return 0;
		
	}
	
}
