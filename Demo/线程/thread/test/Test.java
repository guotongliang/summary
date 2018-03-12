package com.tong.thread.test;

public class Test {
	public static void main(String[] args) {
		/*MyThread thread = new MyThread("第一个线程：");
		MyThread thread1 = new MyThread("第二个线程：");
		thread.start();
		thread1.start();
		System.out.println("当前线程名称："+Thread.currentThread().getName());
		System.out.println("线程结束");*/
		/*
		 * 这两个线程去抢，谁先抢到，谁先执行
		 */
		
		MyThread thread2 = new MyThread("线程：");
		thread2.start();
		for (int i = 0; i < 10; i++) {
			try {
				Thread.currentThread().sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println(Thread.currentThread().getName()+":"+i);
		}
	}
}
