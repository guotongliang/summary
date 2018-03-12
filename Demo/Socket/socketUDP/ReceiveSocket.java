
import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;

/**
 * UDP协议接收数据 1.在接收端创建socket对象 2.获取数据包 3.调用接收 4.解析数据包，将数据显示在控制台中 5.释放资源
 * 
 * @author Administrator
 *
 */
public class ReceiveSocket {
	public static void main(String[] args) throws IOException {
		// 1.在接收端创建socket对象
		DatagramSocket ds = new DatagramSocket(65500);

		while (true) {
			// 2.获取数据包
			byte[] buf = new byte[1024];
			int length = buf.length;
			DatagramPacket dp = new DatagramPacket(buf, length);

			// 3.调用接收
			ds.receive(dp);//(阻塞式：程序运行到这个位置停下来，等着接收到信息之后继续运行)

			//显示谁发送的内容
			InetAddress net = dp.getAddress();
			String url = net.getHostAddress();
			// 4.解析数据包，将数据显示在控制台中
			byte[] b = dp.getData();
			int len = dp.getLength();
			String str = new String(b, 0, len);
			System.out.println(url+":"+str);

		}
		// 5.释放资源
		//ds.close();

	}
}
