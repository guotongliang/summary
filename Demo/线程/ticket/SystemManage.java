package com.tong.ticket;

/**
 * ��Ʊϵͳ
 * 
 * @author Administrator
 *
 */
public class SystemManage {
	private int number = 0;

	/*
	 * ����̲߳���ȫ�����ַ�ʽ
	 */
	
	
	/*
	 * 1.��������ͬ��
	 * 
	 */
//	 public synchronized int getNumber() {
//		return number++;
//	}
	
	
	/*
	 * 2.ֻ����ĳһ�д���ͬ����ͬ������飩
	 */
	static Object obj = new Object();
	public int getNumber(){
		synchronized (obj) {
			return number++;
		}
	}
	
	/*
	 * 3.����/����
	 */
	public void show(){
		this.notify();//����
		System.out.println("��ʼ");
		try {
			this.wait();//���̹߳���
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
	
}
