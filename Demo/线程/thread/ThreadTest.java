package com.tong.thread;

public class ThreadTest extends Thread{

	@Override
	public void run() {
		for (int i = 0; i < 5; i++) {
			System.out.println("i:"+i);
		}
		super.run();
	}
	
}
