package com.tong.socket.chat;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class ReceiveThread implements Runnable {
	private DatagramSocket ds;
	public ReceiveThread(DatagramSocket ds){
		this.ds = ds;
	}
	@Override
	public void run() {
		try {
			while (true) {
				// 2.��ȡ���ݰ�
				byte[] buf = new byte[1024];
				int length = buf.length;
				DatagramPacket dp = new DatagramPacket(buf, length);

				// 3.���ý���
				ds.receive(dp);//

				//��ȡip��ַ
				InetAddress net = dp.getAddress();
				String url = net.getHostAddress();
				// 4.�������ݰ�����������ʾ�ڿ���̨
				byte[] b = dp.getData();
				int len = dp.getLength();
				String str = new String(b, 0, len);
				System.out.println(url+":"+str);

			}
			// 5.�ͷ���Դ
			//ds.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
