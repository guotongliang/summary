package com.tong.water;

public class Test {
	public static void main(String[] args) {
		Student stu1 = new Student("����");
		Student stu2 = new Student("����");
		Student stu3 = new Student("����");
		stu1.start();
		try {
			stu1.join();//����join��������ǰ�߳�ִ����ϣ������̲߳ſ���ȥ��CPUʱ�䡣
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		stu2.start();
		stu3.start();
	}
}
