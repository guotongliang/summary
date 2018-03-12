package com.tong.stream;
/**
 * ZipOutputStreamѹ����--ѹ���ļ�
 * @author Administrator
 *
 */

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

public class ZipOutputStreamTest {
	public static void main(String[] args) {
		File file = new File("d:\\mmp");
		File zipFile = new File("d:\\ѹ���ļ�.zip");
		
		OutputStream fos = null;
		ZipOutputStream zos = null;
		InputStream fis = null;
		try {
			//������д�뵽ѹ���ļ���
			fos = new FileOutputStream(zipFile);
			zos = new ZipOutputStream(fos);
			File[] files = file.listFiles();//��ȡmmp�ļ��������е��ļ�
			for (File f : files) {
				fis = new FileInputStream(f);
				byte[] b = new byte[fis.available()];
				fis.read(b);//��ȡ�����ݷŵ��ֽ�����b��
				//����putNextEntry����������ÿһ��ѹ��ʵ����ļ���
				zos.putNextEntry(new ZipEntry(f.getName()));
				//д��
				zos.write(b);
			}
			System.out.println("ѹ���ɹ�");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}finally{
			try {
				if(zos!=null) zos.close();
				if(fis!=null) fis.close();
				if(fos!=null) fos.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
