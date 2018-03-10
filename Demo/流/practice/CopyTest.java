package com.tong.stream.practice;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class CopyTest {
	public static void main(String[] args) {
		InputStream fis = null;//输入流--读取操作
		OutputStream fos = null;//输出流--写入操作
		
		try {
			//读取原文件中的内容
			fis = new FileInputStream("D:\\hello.txt");
			byte[] b = new byte[fis.available()];
			fis.read(b);
			
			//写入到新的文件中
			fos = new FileOutputStream("d:\\mmp\\mmp.txt");
			fos.write(b);
			System.out.println("复制成功");
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			try {
				if(fos!=null) fos.close();
				if(fis!=null) fis.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
