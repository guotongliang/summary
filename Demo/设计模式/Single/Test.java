package com.tong.single;

public class Test {
	public static void main(String[] args) {
		MySingle single1 = MySingle.newInstance();
		MySingle single2 = MySingle.newInstance();
		MySingle single3 = MySingle.newInstance();
		System.out.println(single1);
		System.out.println(single2);
		System.out.println(single3);
	}
}
