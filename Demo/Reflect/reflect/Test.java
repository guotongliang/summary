package com.tong.reflect;

public class Test {
	public static void main(String[] args) {
		Pet dog = new Dog();
		Pet pengin = new Penguin();
		Master mas = new Master();
		mas.feed(dog);//运行过程中赋的值，属于动态绑定
		
	}
}
