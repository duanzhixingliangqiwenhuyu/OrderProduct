package com.table.controller;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.eclipse.jdt.internal.compiler.parser.ParserBasicInformation;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.table.service.reservarFormService;

@Controller
/*
 * 该Controller实现的是对预约页面信息进行接收，插入数据库的功能
 * */

public class reservarFormController {
	
	@Resource
	private reservarFormService reservarFormService;
	
	@RequestMapping("/reservar-form")
	public void reservarForm(HttpServletRequest request,HttpServletResponse response,@RequestParam(value="phone-number")String phone_number,@RequestParam(value="people-number")int people_number,@RequestParam(value="estimate-time") String estimate_time,@RequestParam(value="table-number")int table_number) {
		HttpSession session =request.getSession();
		
		System.out.println(people_number);

		reservarFormService.insertdb_reservar(phone_number,people_number,estimate_time,table_number);
	}
}
