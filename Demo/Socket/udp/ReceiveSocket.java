package com.tong.socket.udp;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;

/**
 * UDPЭ���������
 * 1.�ڽ��ն˴���Socket����
 * 2.��ȡ���ݰ�
 * 3.���ý���
 * 4.�������ݰ�����������ʾ�ڿ���̨
 * 5.�ͷ���Դ
 * @author Administrator
 *
 */
public class ReceiveSocket {
	public static void main(String[] args) throws IOException {
		// 1.�ڽ��ն˴���Socket����
		DatagramSocket ds = new DatagramSocket(65500);

		while (true) {
			// 2.��ȡ���ݰ�
			byte[] buf = new byte[1024];//�����ݶ��ʱ���*64KB
			int length = buf.length;
			DatagramPacket dp = new DatagramPacket(buf, length);

			// 3.���ý���
			ds.receive(dp);//������е��ⲽ��ʱ��ȴ����ͷ�����Ϣ������

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

	}
}
