
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

/**
 * UDP协议发送数据 1.在发送端创建Socket对象 2.创建数据包 3.调用Socket对象的发送的方法（send） 4.释放资源
 * 
 * @author Administrator
 *
 */
public class SendSocket {
	public static void main(String[] args) throws IOException {
		// 1.在发送端创建Socket对象
		DatagramSocket ds = new DatagramSocket();

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = null;
		while ((str = br.readLine()) != null) {
			// 2.创建数据包
			/*
			 * String str = "你好，我是张三"; byte [] buf = str.getBytes();
			 */
			byte[] buf = str.getBytes();
			int length = buf.length;
			InetAddress address = InetAddress.getByName("GTL");//给谁发送信息，这里就填写谁的IP地址或者计算机名
			int port = 65500;
			DatagramPacket dp = new DatagramPacket(buf, length, address, port);
			//DatagramPacket dp1 = new DatagramPacket(buf, buf.length, InetAddress.getByName("GTL"), 65500);
			// 3.调用Socket对象的发送的方法（send）
			ds.send(dp);

		}

		// 4.释放资源
		ds.close();

	}
}
