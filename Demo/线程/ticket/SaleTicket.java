package com.tong.ticket;

/**
 * ÊÛÆ±´°¿Ú
 * 
 * @author Administrator
 *
 */
public class SaleTicket extends Thread {
	public SaleTicket(){}
	public SaleTicket(String name){
		this.setName(name);
	}
	SystemManage manage = null;

	@Override
	public void run() {
		for (int i = 0; i < 10; i++) {
			System.out.println(this.getName()+":"+manage.getNumber());
		}
	}
}
