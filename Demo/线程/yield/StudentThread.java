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
			Thread.yield();//���̴߳��ھ���״̬������CPUʱ�䣬Ȼ��������������´δ���״̬��
		}
	}
}
