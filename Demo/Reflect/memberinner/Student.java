package com.tong.memberinner;

public class Student {
	String name;
	int age;
	
	public void show(){
		System.out.println("姓名："+name+",年龄："+age);
	}

	/**
	 * 成员内部类
	 * @author Administrator
	 *
	 */
	class Body{
		String sex;
		/*
		 * 内部类可以共享外部类的属性和方法
		 */
		public void test(){
			show();
			System.out.println("性别："+sex);
		}
		/**
		 * 
		 * @author Administrator
		 *
		 */
		public class Teacher{
			String sex;
			
			public void test(){
				show();
				System.out.println("性别："+sex);
			}
		}
	}
	/**
	 * 内部类可以任意嵌套
	 * @author Administrator
	 *
	 */
	public class Teacher{
		String sex;
		
		public void test(){
			show();
			System.out.println("性别："+sex);
		}
	}
}
