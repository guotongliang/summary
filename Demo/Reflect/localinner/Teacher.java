package com.tong.localinner;

public class Teacher {
	public void show(){
		/**
		 * 创建局部内部类
		 * 具有局限性，只能在当前的方法内调用，也就是show();方法
		 * @author Administrator
		 *
		 */
		class Body{
			public void test(){
				System.out.println("这是局部内部类");
			}
		}
		//调用
		Body body = new Body();
		body.test();
	}
}
