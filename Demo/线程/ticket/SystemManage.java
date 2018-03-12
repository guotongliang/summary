package com.tong.ticket;

/**
 * 购票系统
 * 
 * @author Administrator
 *
 */
public class SystemManage {
	private int number = 0;

	/*
	 * 解决线程不安全的三种方式
	 */
	
	
	/*
	 * 1.整个方法同步
	 * 
	 */
//	 public synchronized int getNumber() {
//		return number++;
//	}
	
	
	/*
	 * 2.只是想某一行代码同步（同步代码块）
	 */
	static Object obj = new Object();
	public int getNumber(){
		synchronized (obj) {
			return number++;
		}
	}
	
	/*
	 * 3.唤醒/挂起
	 */
	public void show(){
		this.notify();//开锁
		System.out.println("开始");
		try {
			this.wait();//将线程挂起
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
	
}
