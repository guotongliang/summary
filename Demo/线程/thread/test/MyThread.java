package com.tong.thread.test;

public class MyThread extends Thread {
	public MyThread() {}
	public MyThread(String name) {
		this.setName(name);
	}
	@Override
	public void run() {
		for (int i = 0; i < 6; i++) {
			/*try {//调用sleep方法进入休眠的状态
				this.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}*/
			System.out.println(this.getName()+i);
		}
	}
	
}
