package com.tong.stream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * FileInputStream 输入流--读取操作
 * 
 * @author Administrator
 *
 */
public class FileInputStreamTest {
	public static void main(String[] args) {
		// 创建输入流对象
		FileInputStream fis = null;
		try {
			fis = new FileInputStream("d:\\hello.txt");
			//这种方式可以提升效率
			byte[] b = new byte[fis.available()];//fis.available()获取字节数
			fis.read(b);//将读取到的字节放入到字节数组中
			for (byte c : b) {
				System.out.print((char)c);
			}
			
			/*int num = 0;
			while ((num = fis.read()) != -1) {
				System.out.print((char) num);
			}*/
		} catch (FileNotFoundException e) {// 文件找不到的一个异常
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				if (fis != null) {
					fis.close();
				}
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
