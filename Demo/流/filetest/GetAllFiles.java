package com.tong.filetest;

import java.io.File;

/**
 * 递归算法
 * 
 * @author Administrator
 *
 */
public class GetAllFiles {
	public static void main(String[] args) {
		// 得到根目录c:\ d:\
		File[] roots = File.listRoots();
		for (File file : roots) {
			if (file.isDirectory()) {
				// 得到根目录下的子文件（文件）
				File[] files = file.listFiles();// 磁盘下的子文件或者子文件夹
				for (File f : files) {
					if (f.isDirectory()) {
						// 目录
						show(f);
					} else {
						System.out.println(file.getAbsolutePath());
					}
				}
			} else {
				System.out.println(file.getAbsolutePath());// 如果是文件，显示具体文件路径
			}
		}
	}

	public static void show(File f) {
		// 传过来的是文件还是文件夹，判断
		try {
			if (f.isDirectory()) {
				// 目录
				File[] file = f.listFiles();// 得到子目录
				for (File file2 : file) {
					if (file2.isDirectory()) {
						// 目录
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
