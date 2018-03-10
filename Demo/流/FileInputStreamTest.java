package com.tong.stream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * FileInputStream ������--��ȡ����
 * 
 * @author Administrator
 *
 */
public class FileInputStreamTest {
	public static void main(String[] args) {
		// ��������������
		FileInputStream fis = null;
		try {
			fis = new FileInputStream("d:\\hello.txt");
			//���ַ�ʽ��������Ч��
			byte[] b = new byte[fis.available()];//fis.available()��ȡ�ֽ���
			fis.read(b);//����ȡ�����ֽڷ��뵽�ֽ�������
			for (byte c : b) {
				System.out.print((char)c);
			}
			
			/*int num = 0;
			while ((num = fis.read()) != -1) {
				System.out.print((char) num);
			}*/
		} catch (FileNotFoundException e) {// �ļ��Ҳ�����һ���쳣
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
