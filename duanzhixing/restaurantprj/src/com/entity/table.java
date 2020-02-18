package com.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="mytable")
public class table {
	private int tb_id;//桌子号
	private int tb_num;//几人卓
	private int tb_status;//桌子状态
	private user user;//用户
	private order order;//订单
	
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	public int getTb_id() {
		return tb_id;
	}
	public void setTb_id(int tb_id) {
		this.tb_id = tb_id;
	}
	public int getTb_num() {
		return tb_num;
	}
	public void setTb_num(int tb_num) {
		this.tb_num = tb_num;
	}
	public int getTb_status() {
		return tb_status;
	}
	public void setTb_status(int tb_status) {
		this.tb_status = tb_status;
	}
	
	@ManyToOne
	@JoinColumn(name="user_phone")
	public user getUser() {
		return user;
	}
	public void setUser(user user) {
		this.user = user;
	}
	@ManyToOne
	@JoinColumn(name="order_id")
	public order getOrder() {
		return order;
	}
	public void setOrder(order order) {
		this.order = order;
	}
	
	
	
	
}
