package com.tong.socket.chat;

import java.net.DatagramSocket;
import java.net.SocketException;

public class ChatRoom {
	public static void main(String[] args) throws SocketException {
		DatagramSocket send = new DatagramSocket();
		DatagramSocket receive = new DatagramSocket(12323);
		
		SendThread st = new SendThread(send);
		ReceiveThread rt = new ReceiveThread(receive);
		
		Thread t1 = new Thread(st);
		Thread t2 = new Thread(rt);
		
		t1.start();
		t2.start();		
	}
}
