package com.entity;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class CharsetFilter implements Filter {

	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		// TODO Auto-generated method stub
		HttpServletRequest req = (HttpServletRequest) request;  
		HttpServletResponse res= (HttpServletResponse) response;     
		// 	拦截所有的请求，解决全站中文乱码，指定request和response的编码        
		req.setCharacterEncoding("utf-8"); // 只对消息体有效  
		res.setContentType("text/html;charset=utf-8");      
		chain.doFilter(req,res);


	}

}
