package com.tong.staticinner;

public class StaticClass {
	public static class Body{
		static String name;
		public static void show(){
			System.out.println("这是静态内部类");
		}
	}
}
