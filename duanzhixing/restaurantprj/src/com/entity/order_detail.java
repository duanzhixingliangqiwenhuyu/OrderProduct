package com.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="order_detail")
public class order_detail {
	private int order_detail_id; //订单详情号
	private order order;//订单
	private menu menu;//菜品
	private int order_menu_num;//数量
	
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	public int getOrder_detail_id() {
		return order_detail_id;
	}
	public void setOrder_detail_id(int order_detail_id) {
		this.order_detail_id = order_detail_id;
	}
	
	@ManyToOne
	@JoinColumn(name="order_id")
	public order getOrder() {
		return order;
	}
	public void setOrder(order order) {
		this.order = order;
	}
	@ManyToOne
	@JoinColumn(name="menu_id")
	public menu getMenu() {
		return menu;
	}
	public void setMenu(menu menu) {
		this.menu = menu;
	}
	
	
	public int getOrder_menu_num() {
		return order_menu_num;
	}
	public void setOrder_menu_num(int order_menu_num) {
		this.order_menu_num = order_menu_num;
	}
	
	
}
