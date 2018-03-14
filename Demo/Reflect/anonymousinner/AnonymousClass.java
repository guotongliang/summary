package com.tong.anonymousinner;

public class AnonymousClass {
	public static void main(String[] args) {
		/*
		 * 创建内部类直接使用
		 * 注意：匿名内部类只使用一次，使用匿名内部类必须存在一个父类
		 * （new 的对象就是父类，内部类的方法就是重写父类的方法）
		 */
		new Thread() {
			@Override
			public void run() {
				System.out.println("线程开始");
			}
		}.start();// 这就是匿名函数，一般什么时候用？只创建一个实例的时候用
	}
}
