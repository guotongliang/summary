package com.tong.water;

public class Student extends Thread{
	public Student(){}
	public Student(String name){
		this.setName(name);
	}
	@Override
	public void run() {
		for (int i = 1; i < 4; i++) {
			System.out.println(this.getName()+"£º"+i);
		}
	}
}
