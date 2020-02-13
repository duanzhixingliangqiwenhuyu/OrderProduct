package com.test.controller;

import java.io.IOException;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.entity.user;

import com.test.service.testService;

@Controller
public class testController {
	@Resource
	private testService testService;

	@RequestMapping("/test")
	public String findUser(HttpSession session, HttpServletResponse response) throws IOException {
		System.out.println("ok"); //为什么控制台输出不了
//		response.setContentType("text/html;charset=UTF-8");
		// 设置请求的编码
//		request.setCharacterEncoding("UTF-8")
		String user_phone = "1234567";
		
		user user =testService.findUser(user_phone);
		session.setAttribute("user", user);
		response.getWriter().write(
				"<p>'请您先完成登录!'</p>");
		return "index";
		
	}
}
