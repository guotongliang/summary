package com.tong.example;

import java.sql.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Random;

public class ExampleTest {
	public static void main(String[] args) {
//		ramdomTest();
//		mathTest();
//		dateTest();
		calendarTest();
	}

	/**
	 * Random类的使用
	 */
	private static void ramdomTest() {
		Random random = new Random();
		
		
		/*int num = random.nextInt();
		int max = Integer.MAX_VALUE;
		int min = Integer.MIN_VALUE;
		System.out.println("最大值："+max);
		System.out.println("最小值："+min);
		
		System.out.println("=======================");
		Long max1 = Long.MAX_VALUE;
		Long min1 = Long.MIN_VALUE;
		System.out.println("最大值："+max1);
		System.out.println("最小值："+min1);
		
		System.out.println("=======================");
		Short max2 = Short.MAX_VALUE;
		Short min2 = Short.MIN_VALUE;
		System.out.println("最大值："+max2);
		System.out.println("最小值："+min2);*/
		
		
//		System.out.println(random.nextBoolean());
		//0-9
		int number = random.nextInt(10)+1;
		System.out.println(number);
	}

	/**
	 * Math类
	 */
	public static void mathTest(){
		/*int java = 20;
		int sql = 30;
		int result = java-sql;
		System.out.println(Math.abs(result));*/
		
		System.out.println(Math.ceil(23.1));//向上取整24.0
		System.out.println(Math.floor(20.9));//向下取整20.0
		System.out.println(Math.round(20.5));//四舍五入21	Long类型
		System.out.println(Math.rint(20.5));//取接近整数的值20.0	double类型
		System.out.println(Math.rint(20.6));//21.0	double类型
		System.out.println(Math.E);//自然对数的底e
		System.out.println(Math.PI);//圆周率3.141592653589793
		
	}

	
	/**
	 * Date类
	 */
	public static void dateTest(){
		String str= "1999-9-9";
		
		/*
		 * System.out.println(Date.valueOf(str));//1999-09-09
		 * System.out.println(new java.util.Date().getTime());//返回的是1970.1.1到现在的毫秒数
		 * System.out.println(new java.util.Date());//Wed Mar 14 23:23:08 CST 2018
		 */
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH-mm-ss");
		java.util.Date date = new java.util.Date();
		System.out.println(sdf.format(date));
	} 
	
	/**
	 * Calendar类
	 */
	public static void calendarTest(){
		//通过Calendar类的静态方法getInstance()创建对象
		Calendar ca = Calendar.getInstance();
		java.util.Date date = ca.getTime();
		//获取年月日
		ca.setTime(date);
		System.out.println(ca.get(Calendar.YEAR));
		System.out.println(ca.get(Calendar.MONTH+1));//当前月份需要加1
		System.out.println(ca.get(Calendar.DAY_OF_MONTH));
		System.out.println(ca.get(Calendar.DAY_OF_WEEK));//周日是第一天
		System.out.println(ca.get(Calendar.MONDAY));//周一
	}
	
	
	
	
}
