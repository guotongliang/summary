package com.tong.thread;

public class Test {
	public static void main(String[] args) {
		Thread thread = new ThreadTest();
		thread.start();//������Ĵ���֤�����ǿ�����һ���߳�
//		thread.run();
		System.out.println("�������");
	}
}
