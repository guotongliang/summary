package com.tong.inetaddress;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class Test {
	public static void main(String[] args) throws UnknownHostException {
		InetAddress net = InetAddress.getByName("GTL");
		String  url = net.getHostAddress();
		String name = net.getHostName();
		System.out.println(name+"---"+url);
	}
}
