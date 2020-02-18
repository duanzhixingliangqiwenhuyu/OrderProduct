package com.appointment.basicOperation.controller;

import java.text.SimpleDateFormat;
import java.util.Collection;
import java.util.Date;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.appointment.basicOperation.service.getTableCountService;
import com.appointment.basicOperation.service.getWaitQueueService;
import com.appointment.basicOperation.service.inquiryTableService;
import com.appointment.timePrediction.javaCode.service.countUsingTablePredictTimeService;
import com.entity.order;
import com.entity.table;
import com.util.getMinIndex;
@Controller
public class inquiryTable {

	/**
	 *@desc:异步刷新查询是否有符合客户人数的空余桌位
	 *@param:客户人数
	 *@return:是否有空余座位，有则返回空余桌号
	 *		  没有则调用预估算法得到预估时间返回给浏览器
	 *@author XX
	 *@date:2020年2月13日下午4:16:42
	 */
	@Resource inquiryTableService its;
	@Resource countUsingTablePredictTimeService cutp;
	@Resource getTableCountService gtcs;
	@Resource getWaitQueueService gwqs;
	
	@RequestMapping("/inquiryTable")
	@ResponseBody
	public Map<String, String> inquiryFreeTable(HttpServletRequest request,HttpServletResponse response,@RequestParam(value = "people_number")int people_number) {
		
		//如果人数小于4，小桌，大于四，大桌
		int tb_num =0;
		if (people_number<=4) {
			tb_num = 4;
		}else {
			tb_num = 8;
		}
		
		//返回的结果字符串
		String result_string="";
		//1.查询有无空余桌位，有则返回给页面，无则执行2345步
		List<table> list;
		list=its.getFreeTable(tb_num);//空余桌位集合
		if(list!=null) {
			System.out.println("有空于桌位");
			//拼成字符串写入结果串
			for(table t:list) {
				result_string = result_string+t.getTb_id()+",";
			}
			//删除字符串最后一个字符即"，”
			result_string.substring(0,result_string.length()-1); 
		}else {
			
			//获取当前桌子总数
			int table_num =gtcs.getTableCount(tb_num);
				
			//2.构建一个数组并初始化，用来存储做队列分配
			double[] arr = new double[table_num];
			for(int i =0;i<arr.length;i++) {
				arr[i]=0;
			}//初始化
			for(int i =0;i<arr.length;i++) {System.out.println(arr[i]);}//查看是否成功初始化
			
			//3.将各桌上的现有情况填入数组，没有客户填0，有的填预估剩余用餐时间
				list = its.getUsingTable(tb_num); //已使用桌位的集合
				//遍历该集合，根据订单id查询预估剩余就餐时间
				for(table t:list) {
					double pt = cutp.usingTablePredictTime(t);//返回该桌上的订单的预估剩余时间
					if(pt<0) pt = 0.167;
					//根据桌号修改数组
					arr[t.getTb_id()-1] = pt;
				}
				
			//4.查询数据库得到等待队列，并以此将队列中的元素分配给数组中值最小的数相加，分配完成后，数组中最小的数即为最短预估等待时间
				List<order> order_list = new LinkedList<order>();
				order_list =gwqs.getWaitQueue(tb_num);//获得等待队列
				getMinIndex minIndex = new getMinIndex();//调用工具类
				//遍历等待队列
				for(order wait_order :order_list) {
					//将订单元素的预测时间转换为double
					double wait_predict = Double.parseDouble(wait_order.getOrder_predict());
					//获得数组中的最小值下标
					int mi = minIndex.minIndex(arr);
					//将其加在最小值上
					arr[mi]+=wait_predict;
				}
				//获得最终的时间数组中的最小值
				int predict_index = minIndex.minIndex(arr);
				double predict_time_double = arr[predict_index];
				
				//5.将得到的最短预估时间转换为常见的形式
				int pre_hour = (int)Math.floor(predict_time_double);//小时
				int pre_minute = (int)Math.floor((predict_time_double-pre_hour)*60);//分钟
				//结果串
				result_string = ""+pre_hour+"小时"+pre_minute+"分钟";
				
		}
		
		Map<String, String> map = new HashMap<String, String>();
		map.put("return", result_string);
		return map;
		
		
	}
}
