package com.tong.thread.test;

public class Test {
	public static void main(String[] args) {
		/*MyThread thread = new MyThread("��һ���̣߳�");
		MyThread thread1 = new MyThread("�ڶ����̣߳�");
		thread.start();
		thread1.start();
		System.out.println("��ǰ�߳����ƣ�"+Thread.currentThread().getName());
		System.out.println("�߳̽���");*/
		/*
		 * �������߳�ȥ����˭��������˭��ִ��
		 */
		
		MyThread thread2 = new MyThread("�̣߳�");
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
