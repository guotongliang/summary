package com.tong.stream;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * FileOutputStream 
 * @author Administrator
 *
 */
public class FileOutputStreamTest {
	public static void main(String[] args) {
		FileOutputStream fos = null;
		try {
			fos= new FileOutputStream("d:\\hello.txt",true);//true����ԭ��������
			String str = "\n�����";
			byte[] b=str.getBytes();//���ַ�ת�����ֽ�����
			fos.write(b);
			System.out.println("д��ɹ�");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			try {
				if(fos!=null){
					fos.close();
				}
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
