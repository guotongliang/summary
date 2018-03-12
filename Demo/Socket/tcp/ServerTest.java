package com.tong.socket.tcp;

import java.io.IOException;
import java.io.InputStream;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * TCP协议接收数据
 * 1.在接收方创建Socket对象
 * 2.创建发送方的监听器
 * 3.创建输入流，读取数据显示在控制台
 * 4.释放资源
 * @author Administrator
 *
 */
public class ServerTest {
	public static void main(String[] args) throws IOException {
		// 1.在接收方创建Socket对象
		ServerSocket re = new ServerSocket(12334);

		// 2.创建发送方的监听器
		Socket s = re.accept();

		String url = s.getInetAddress().getHostAddress();
		// 3.创建输入流，读取数据显示在控制台
		InputStream is = s.getInputStream();
		byte[] b = new byte[1024];
		int len = is.read(b);
		String str = new String(b, 0, len);
		System.out.println(url+":"+str);
		// 4.释放资源
		re.close();

	}
}
