package com.tong.yield;

public class StudentThread extends Thread{
	public StudentThread(){}
	public StudentThread(String name){
		this.setName(name);
	}
	@Override
	public void run() {
		for (int i = 0; i < 5; i++) {
			System.out.println(this.getName()+":"+i);
			Thread.yield();//让线程处于就绪状态（抢到CPU时间，然后放弃掉，进入下次待抢状态）
		}
	}
}
