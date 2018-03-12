package com.tong.socket.udp;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;

/**
 * UDP协议接收数据
 * 1.在接收端创建Socket对象
 * 2.获取数据包
 * 3.调用接收
 * 4.解析数据包，将数据显示在控制台
 * 5.释放资源
 * @author Administrator
 *
 */
public class ReceiveSocket {
	public static void main(String[] args) throws IOException {
		// 1.在接收端创建Socket对象
		DatagramSocket ds = new DatagramSocket(65500);

		while (true) {
			// 2.获取数据包
			byte[] buf = new byte[1024];//当数据多的时候会*64KB
			int length = buf.length;
			DatagramPacket dp = new DatagramPacket(buf, length);

			// 3.调用接收
			ds.receive(dp);//程序进行到这步的时候等待发送方的信息传过来

			//获取ip地址
			InetAddress net = dp.getAddress();
			String url = net.getHostAddress();
			// 4.解析数据包，将数据显示在控制台
			byte[] b = dp.getData();
			int len = dp.getLength();
			String str = new String(b, 0, len);
			System.out.println(url+":"+str);
		}
		// 5.释放资源
		//ds.close();

	}
}
