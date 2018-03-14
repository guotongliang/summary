package com.tong.reflect1;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class Test {
	public static void main(String[] args) {
//		test(new Student());
		// test(1);
		// test("sdsd");
		
		
		test1(Student.class);
	}

	public static void test(Object obj) {
		Class c = obj.getClass();
		System.out.println("=========类的信息===============");
		System.out.println(c.getName());

		System.out.println("=========构造方法=================");
		Constructor[] con = c.getConstructors();
		for (int i = 0; i < con.length; i++) {
			System.out.println(con[i]);
		}

		System.out.println("=========属性=================");
		Field[] field = c.getFields();
		for (int i = 0; i < field.length; i++) {
			System.out.println(field[i]);// 属性这种访问，访问的是公有的属性
		}

		System.out.println("=========方法=================");
		Method[] method = c.getMethods();
		for (int i = 0; i < method.length; i++) {
			if(method[i].getName().startsWith("show")){
				System.out.println(method[i]);
			}
			/*
			 *  方法这里会访问几个父类的方法
			 *  但是如果只是想显示指定的方法，需要用startWith();的方法
			 */
		}
	}
	
	
	public static void test1(Class c){
//		System.out.println(c.getName());
		
		try {
			Class cl = Class.forName("com.tong.reflect1.Student");
			System.out.println(cl.getName());
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
