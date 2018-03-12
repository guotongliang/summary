package com.tong.filetest;

import java.io.File;

/**
 * �ݹ��㷨
 * 
 * @author Administrator
 *
 */
public class GetAllFiles {
	public static void main(String[] args) {
		// �õ���Ŀ¼c:\ d:\
		File[] roots = File.listRoots();
		for (File file : roots) {
			if (file.isDirectory()) {
				// �õ���Ŀ¼�µ����ļ����ļ���
				File[] files = file.listFiles();// �����µ����ļ��������ļ���
				for (File f : files) {
					if (f.isDirectory()) {
						// Ŀ¼
						show(f);
					} else {
						System.out.println(file.getAbsolutePath());
					}
				}
			} else {
				System.out.println(file.getAbsolutePath());// ������ļ�����ʾ�����ļ�·��
			}
		}
	}

	public static void show(File f) {
		// �����������ļ������ļ��У��ж�
		try {
			if (f.isDirectory()) {
				// Ŀ¼
				File[] file = f.listFiles();// �õ���Ŀ¼
				for (File file2 : file) {
					if (file2.isDirectory()) {
						// Ŀ¼
						show(file2);
					} else {
						System.out.println(file2.getAbsolutePath());
					}
				}
			} else {
				System.out.println(f.getAbsolutePath());
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
