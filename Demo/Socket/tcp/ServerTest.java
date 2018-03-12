package com.tong.socket.tcp;

import java.io.IOException;
import java.io.InputStream;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * TCPЭ���������
 * 1.�ڽ��շ�����Socket����
 * 2.�������ͷ��ļ�����
 * 3.��������������ȡ������ʾ�ڿ���̨
 * 4.�ͷ���Դ
 * @author Administrator
 *
 */
public class ServerTest {
	public static void main(String[] args) throws IOException {
		// 1.�ڽ��շ�����Socket����
		ServerSocket re = new ServerSocket(12334);

		// 2.�������ͷ��ļ�����
		Socket s = re.accept();

		String url = s.getInetAddress().getHostAddress();
		// 3.��������������ȡ������ʾ�ڿ���̨
		InputStream is = s.getInputStream();
		byte[] b = new byte[1024];
		int len = is.read(b);
		String str = new String(b, 0, len);
		System.out.println(url+":"+str);
		// 4.�ͷ���Դ
		re.close();

	}
}
