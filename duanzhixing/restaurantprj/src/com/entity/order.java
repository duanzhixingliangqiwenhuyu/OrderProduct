package com.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
@Entity
@Table(name="myorder")
public class order {
	private int order_id;//订单号
	private int order_man_num;//人数
	private String order_predict;//预估用餐时间
	private String order_start;//起始时间
	private String order_end;//结束时间
	private table table;//桌号
	private user user;//用户
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	public int getOrder_id() {
		return order_id;
	}
	public void setOrder_id(int order_id) {
		this.order_id = order_id;
	}
	public int getOrder_man_num() {
		return order_man_num;
	}
	public void setOrder_man_num(int order_man_num) {
		this.order_man_num = order_man_num;
	}
	public String getOrder_predict() {
		return order_predict;
	}
	public void setOrder_predict(String order_predict) {
		this.order_predict = order_predict;
	}
	public String getOrder_start() {
		return order_start;
	}
	public void setOrder_start(String order_start) {
		this.order_start = order_start;
	}
	public String getOrder_end() {
		return order_end;
	}
	public void setOrder_end(String order_end) {
		this.order_end = order_end;
	}
	@ManyToOne
	@JoinColumn(name="tb_id")
	public table getTable() {
		return table;
	}
	public void setTable(table table) {
		this.table = table;
	}
	@ManyToOne
	@JoinColumn(name="user_phone")
	public user getUser() {
		return user;
	}
	public void setUser(user user) {
		this.user = user;
	}
	
	
	
}
