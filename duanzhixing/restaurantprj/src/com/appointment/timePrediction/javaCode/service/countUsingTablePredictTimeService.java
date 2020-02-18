package com.appointment.timePrediction.javaCode.service;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.entity.table;


@Service
@Transactional(readOnly=false)
public class countUsingTablePredictTimeService {
	
	/**
	 *@desc:该方法用于根据order计算当前正在用餐的客户的预估剩余用餐时间
	 *@param:
	 *@return:
	 *@author XX
	 *@date:2020年2月16日下午4:22:42
	 */
	public double usingTablePredictTime(table t) {
		
			String start_time = t.getOrder().getOrder_start();//获取开始时间
			double start_time_double = Double.parseDouble(start_time);//转成double
			Date date = new Date();//获取当前时间
			SimpleDateFormat formatter = new SimpleDateFormat("HH.mm");//转成时分模式
			String nowdate = formatter.format(date);
			double now_time_double = Double.parseDouble(nowdate);//转成double
			double using_time = now_time_double - start_time_double; //计算已经用了的时间
			//获取预估时间，转成double，减去已使用时间，得到剩余时间
			double predict_time = Double.parseDouble(t.getOrder().getOrder_predict())-using_time;
			return predict_time;
	}
}
