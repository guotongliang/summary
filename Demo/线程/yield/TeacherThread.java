package com.tong.yield;

public class TeacherThread extends Thread{
	public TeacherThread(){}
	public TeacherThread(String name){
		this.setName(name);
	}
	@Override
	public void run() {
		for (int i = 0; i < 5; i++) {
			System.out.println(this.getName()+":"+i);
			Thread.yield();
		}
	}
}
