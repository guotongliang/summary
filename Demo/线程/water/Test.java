package com.tong.water;

public class Test {
	public static void main(String[] args) {
		Student stu1 = new Student("张三");
		Student stu2 = new Student("李四");
		Student stu3 = new Student("王五");
		stu1.start();
		try {
			stu1.join();//调用join方法：当前线程执行完毕，其他线程才可以去抢CPU时间。
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		stu2.start();
		stu3.start();
	}
}
