package com.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="menu")
public class menu {
	private int menu_id;//菜id
	private String menu_name;//菜名
	private String menu_picture;//菜品照片
	private String menu_recommend;//菜品介绍
	private int menu_price;//菜品价格
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	public int getMenu_id() {
		return menu_id;
	}
	public void setMenu_id(int menu_id) {
		this.menu_id = menu_id;
	}
	public String getMenu_name() {
		return menu_name;
	}
	public void setMenu_name(String menu_name) {
		this.menu_name = menu_name;
	}
	public String getMenu_picture() {
		return menu_picture;
	}
	public void setMenu_picture(String menu_picture) {
		this.menu_picture = menu_picture;
	}
	public String getMenu_recommend() {
		return menu_recommend;
	}
	public void setMenu_recommend(String menu_recommend) {
		this.menu_recommend = menu_recommend;
	}
	public int getMenu_price() {
		return menu_price;
	}
	public void setMenu_price(int menu_price) {
		this.menu_price = menu_price;
	}
	
}
