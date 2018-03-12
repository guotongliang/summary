package com.tong.myrunnable;

public class Test {
	public static void main(String[] args) {
		MyRunnable runnable = new MyRunnable();
		Thread thread = new Thread(runnable);
		thread.start();
	}
}
