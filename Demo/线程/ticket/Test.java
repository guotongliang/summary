package com.tong.ticket;

import java.util.Collections;
import java.util.HashMap;

public class Test {
	public static void main(String[] args) {
		//售票系统
		SystemManage manage = new SystemManage();
		SaleTicket s1 = new SaleTicket("第一个售票口");
		SaleTicket s2 = new SaleTicket("第二个售票口");
		SaleTicket s3 = new SaleTicket("第三个售票口");
		//三个售票口共用一个售票系统
		s1.manage = manage;
		s2.manage = manage;
		s3.manage = manage;
		s1.start();
		s2.start();
		s3.start();
		
		
		//解决HashMap线程非安全的问题
		HashMap<String, String> map = new HashMap<String, String>();
		Collections.synchronizedMap(map);
	}
}
