package com.tong.thread;

public class Test {
	public static void main(String[] args) {
		Thread thread = new ThreadTest();
		thread.start();//虚拟机的处理，证明的是开启了一个线程
//		thread.run();
		System.out.println("程序结束");
	}
}
