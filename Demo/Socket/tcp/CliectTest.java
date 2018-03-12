package com.tong.socket.tcp;

import java.io.IOException;
import java.io.OutputStream;
import java.net.Socket;
import java.net.UnknownHostException;

/**
 * TCP协议发送数据(Socket)
 * 1.在发送方创建Socket对象
 * 2.创建输出流，写入数据
 * 3.释放资源
 * @author Administrator
 *
 */
public class CliectTest {
	public static void main(String[] args) throws IOException {
		// 1.在发送方创建Socket对象
		Socket send = new Socket("GTL", 12334);

		// 2.创建输出流，写入数据
		OutputStream os = send.getOutputStream();
		os.write("我要发送信息了".getBytes());

		// 3.释放资源
		send.close();

	}
}
