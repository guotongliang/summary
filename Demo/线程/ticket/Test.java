package com.tong.ticket;

import java.util.Collections;
import java.util.HashMap;

public class Test {
	public static void main(String[] args) {
		//��Ʊϵͳ
		SystemManage manage = new SystemManage();
		SaleTicket s1 = new SaleTicket("��һ����Ʊ��");
		SaleTicket s2 = new SaleTicket("�ڶ�����Ʊ��");
		SaleTicket s3 = new SaleTicket("��������Ʊ��");
		//������Ʊ�ڹ���һ����Ʊϵͳ
		s1.manage = manage;
		s2.manage = manage;
		s3.manage = manage;
		s1.start();
		s2.start();
		s3.start();
		
		
		//���HashMap�̷߳ǰ�ȫ������
		HashMap<String, String> map = new HashMap<String, String>();
		Collections.synchronizedMap(map);
	}
}
