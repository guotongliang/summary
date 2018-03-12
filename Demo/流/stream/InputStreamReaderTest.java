package com.tong.stream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

/**
 * InputStreamReader：转换流：将字节流转换成字符流
 * 
 * @author Administrator
 *
 */
public class InputStreamReaderTest {
	public static void main(String[] args) {
		InputStream fis = null;
		InputStreamReader isr = null;
		try {
			fis = new FileInputStream("D:\\hello.txt");
			isr = new InputStreamReader(fis);//gb2312  big5  utf-8 字符编码
			int num = 0;
			while ((num = isr.read()) != -1) {
				System.out.print((char) num);
			}

			/*
			 * byte[] b = new byte[fis.available()]; fis.read(b); for (byte c :
			 * b) { System.out.print((char)c); }
			 */

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if (isr != null)
					isr.close();
				if (fis != null)
					fis.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}
