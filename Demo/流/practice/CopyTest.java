package com.tong.stream.practice;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class CopyTest {
	public static void main(String[] args) {
		InputStream fis = null;//������--��ȡ����
		OutputStream fos = null;//�����--д�����
		
		try {
			//��ȡԭ�ļ��е�����
			fis = new FileInputStream("D:\\hello.txt");
			byte[] b = new byte[fis.available()];
			fis.read(b);
			
			//д�뵽�µ��ļ���
			fos = new FileOutputStream("d:\\mmp\\mmp.txt");
			fos.write(b);
			System.out.println("���Ƴɹ�");
			
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
