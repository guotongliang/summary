package com.tong.memberinner;

public class Test {
	public static void main(String[] args) {
		/*Student stu = new Student(); 
		stu.show();*/
		
		//创建内部类的对象
		Student.Body body = new Student().new Body();
		body.sex = "男";
		body.test();
	}
}
