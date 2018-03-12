package com.tong.stream;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;
import java.util.zip.ZipInputStream;

/**
 * ZipInputStream����ѹ
 * 
 * @author Administrator
 *
 */
public class ZipInputStreamTest {
	public static void main(String[] args) {
		File zipF = new File("D:\\ѹ���ļ�.zip");

		InputStream fis = null;
		OutputStream fos = null;
		ZipInputStream zis = null;
		try {
			ZipFile zip = new ZipFile(zipF);// ��ѹ���ļ��ж�ȡÿһ��ѹ��ʵ�塣
			fis = new FileInputStream(zipF);// ��zipF���ѹ���ļ����ж�ȡ
			zis = new ZipInputStream(fis);

			ZipEntry entry = null;
			// ����ѹ���ļ��е�ÿһ��ʵ��
			while ((entry = zis.getNextEntry()) != null) {
				fis = zip.getInputStream(entry);// ����entryѹ��ʵ���ȡ��һ���ļ���
				byte[] b = new byte[fis.available()];
				fis.read(b);

				//����һ���ļ���
				File ff = new File("D:\\ѹ���ļ�");
				ff.mkdir();
				// ȷ����ѹ֮����ļ�·��
				File file = new File("D:\\ѹ���ļ�\\" + entry.getName());
				// ���ļ����뵽�������
				fos = new FileOutputStream(file);
				fos.write(b);
			}
			System.out.println("��ѹ�ɹ�");
			/*
			 * ZipEntry entry = zis.getNextEntry();
			 * System.out.println(entry.getName());hello.txt
			 */
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if (fos != null)
					fos.close();
				if (fis != null)
					fis.close();
				if (zis != null)
					zis.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}
}
