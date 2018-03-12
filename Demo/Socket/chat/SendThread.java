package com.tong.socket.chat;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.UnknownHostException;

public class SendThread implements Runnable {
	private DatagramSocket ds;
	public SendThread(DatagramSocket ds){
		this.ds = ds;
	}
	
	@Override
	public void run() {
		try {
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			String str = null;
			while ((str = br.readLine()) != null) {
				// 2.创建数据�?
				/*
				 * String str = "我要发�?�数据了"; byte [] buf = str.getBytes();
				 */
				byte[] buf = str.getBytes();
				int length = buf.length;
				InetAddress address = InetAddress.getByName("GTL");
				int port = 12323;
				DatagramPacket dp = new DatagramPacket(buf, length, address, port);
				//DatagramPacket dp1 = new DatagramPacket(buf, buf.length, InetAddress.getByName("GTL"), 65500);
				// 3.调用Socket对象的发送的方法
				ds.send(dp);

			}

			// 4.释放资源
			ds.close();
		} catch (UnknownHostException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
