package com.appointment.basicOperation.dao;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.springframework.stereotype.Repository;


import com.entity.table;
import com.util.BaseDao;
/**
 *@desc:从数据库中查询得到满足桌子状态集合的dao，例如用于查询空余的桌子集合，或者是查询已被占用的桌子的集合
 *@param:待查询状态 0（空余）或1（已占用）
 *@return:set
 *@author XX
 *@date:2020年2月15日下午4:16:11
 */
@Repository

public class getTableStatusSetDao extends BaseDao<table> {
	public List<table> getTableSet(int status,int tb_num){
		List<table> list = new ArrayList<table>();
		String hql = "from table t where t.tb_status =? and t.tb_num =?";
		
		
		
		list = find(hql,status,tb_num);
		if(list.size()==0) {list = null;}
		
		
		return list;
	}
}
