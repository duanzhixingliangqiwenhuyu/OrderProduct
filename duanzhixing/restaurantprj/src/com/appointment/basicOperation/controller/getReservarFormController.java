package com.appointment.basicOperation.controller;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.eclipse.jdt.internal.compiler.parser.ParserBasicInformation;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import com.appointment.basicOperation.service.*;
import com.appointment.timePrediction.usePython.usePython;


/**
 *@desc:接收预约表单信息，插数据库
 *@param:phone_number（电话）,people_number（人数）,estimate_time（预估时间）,table_number（桌号）
 *@return:
 *@author XX
 *@date:2020年2月17日下午9:12:52
 */
@Controller
/*
 * 该Controller实现的是对预约页面表单信息进行接收，插入数据库的功能
 * */

public class getReservarFormController {
	
	@Resource
	private reservarFormService reservarFormService;
	
	@RequestMapping("/reservar-form")
	public void reservarForm(HttpServletRequest request,HttpServletResponse response,@RequestParam(value="phone-number")String phone_number,@RequestParam(value="people-number")int people_number,@RequestParam(value="table-number")int table_number) {
		//获取session
		HttpSession session =request.getSession();
		//调用预估算法进行时间预估
		usePython u = new usePython();
		String estimate_time = u.usePython("all");

		//调用service方法实现插入数据库的目的
		reservarFormService.insertdb_reservar(phone_number,people_number,estimate_time,table_number);
	}
}
