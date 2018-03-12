package com.tong.stream;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;

/**
 * OutputStreamWriter：转换流，字符流转换成字节流
 * 
 * @author Administrator
 *
 */
public class OutputStreamWriterTest {
	public static void main(String[] args) {
		OutputStream fos = null;
		OutputStreamWriter osw = null;
		try {
			fos = new FileOutputStream("D:\\hello.txt", true);
			osw = new OutputStreamWriter(fos);
			String str = "\r\n逛商城";
			osw.write(str);
			System.out.println("写入成功");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if (osw != null)
					osw.close();
				if (fos != null)
					fos.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}
