package com.tong.filetest;

import java.io.File;
import java.io.IOException;

public class FileTest {
	public static void main(String[] args) {
		File file = new File("D:\\hello.txt");//����д��d:\\hello.txt
		if(file.exists()){
			System.out.println("����");
			if(file.isFile()){
				System.out.println("���ļ�");
				//�õ��ļ���ַ
				System.out.println(file.getPath());//���·��
				System.out.println(file.getAbsolutePath());//����·��
				System.out.println(file.getName());
				System.out.println("���ȣ�"+file.length());
				//��ĸһ���ֽ�
				//���������ֽ�
				//�س������ֽ�
				//ɾ����ָ��Ŀ¼�µ��ļ�
				//file.delete();
				
			}
			if(file.isDirectory()){
				System.out.println("��Ŀ¼");
			}
		}else{
			System.out.println("������");
			try {
				file.createNewFile();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
