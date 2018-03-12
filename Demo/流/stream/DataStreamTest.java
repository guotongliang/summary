package com.tong.stream;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/**
 * 
 * 数据流：DataInputStream、DataOutputStream（二进制的）
 * @author Administrator
 *
 */
public class DataStreamTest {
	public static void main(String[] args) {
		InputStream fis = null;
		DataInputStream dis = null;
		OutputStream fos = null;
		DataOutputStream dos = null;
		
		try {
			//读取图片的数据
			fis = new FileInputStream("D:\\2.PNG");
			dis = new DataInputStream(fis);
			
			byte[] b = new byte[dis.available()];
			dis.read(b);
			//写入到新的文件中
			fos = new FileOutputStream("D:\\mmp\\图.png");
			dos = new DataOutputStream(fos);
			dos.write(b);
			System.out.println("复制成功");
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			try {
				if(dos!=null) dos.close();
				if(fos!=null) fos.close();
				if(dis!=null) dis.close();
				if(fis!=null) fis.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
	}
}
