package com.appointment.timePrediction.usePython;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class usePython {

		public String usePython(String s ) {
			Process proc;
			String sresult = null;
		        try {
		        	//构建传递给python的字符串数组
		        	String[] spara = new String[] { String.valueOf("python"),"D:/python/pychar/untitled1/test.py",s};
		        	// 执行py文件
		            proc = Runtime.getRuntime().exec(spara);
		            //读数据
		            BufferedReader in = new BufferedReader(new InputStreamReader(proc.getInputStream(),"UTF-8"));
		            String line = null;
		            //用来记录下来返回的推荐结果
		           
		            sresult ="";
		            while ((line = in.readLine()) != null) {
		            	sresult += line;
		            }
		            in.close();

		            proc.waitFor();

		        } catch (IOException e) {

		            e.printStackTrace();

		        } catch (InterruptedException e) {

		            e.printStackTrace();

		        } 
		
			return sresult;
			
		}
		
		//调用测试
//		public static void main(String[] args) {
//			// TODO Auto-generated method stub
//			
//			usePython u = new usePython();
//			String res = u.usePython("all");
//		
//			System.out.println(res);
//			
//		}	
}


