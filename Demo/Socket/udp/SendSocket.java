package com.tong.socket.udp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

/**
 * UDP协议发送数据
 * 1.在发送端创建Socket对象
 * 2.创建数据包
 * 3.调用Socket对象的发送的方法
 * 4.释放资源
 * @author Administrator
 *
 */
public class SendSocket {
	public static void main(String[] args) throws IOException {
		// 1.在发送端创建Socket对象
		DatagramSocket ds = new DatagramSocket();

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));//从控制台读取要发送的信息
		String str = null;
		while ((str = br.readLine()) != null) {
			// 2.创建数据包
			/*
			 * String str = "我要发送数据了"; byte [] buf = str.getBytes();
			 */
			byte[] buf = str.getBytes();
			int length = buf.length;
			InetAddress address = InetAddress.getByName("GTL");//
			int port = 65500;
			DatagramPacket dp = new DatagramPacket(buf, length, address, port);
			//DatagramPacket dp1 = new DatagramPacket(buf, buf.length, InetAddress.getByName("GTL"), 65500);
			// 3.调用Socket对象的发送的方法
			ds.send(dp);

		}

		// 4.释放资源
		ds.close();

	}
}
