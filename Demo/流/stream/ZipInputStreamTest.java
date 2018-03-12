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
 * ZipInputStream：解压
 * 
 * @author Administrator
 *
 */
public class ZipInputStreamTest {
	public static void main(String[] args) {
		File zipF = new File("D:\\压缩文件.zip");

		InputStream fis = null;
		OutputStream fos = null;
		ZipInputStream zis = null;
		try {
			ZipFile zip = new ZipFile(zipF);// 从压缩文件中读取每一个压缩实体。
			fis = new FileInputStream(zipF);// 对zipF这个压缩文件进行读取
			zis = new ZipInputStream(fis);

			ZipEntry entry = null;
			// 遍历压缩文件中的每一个实体
			while ((entry = zis.getNextEntry()) != null) {
				fis = zip.getInputStream(entry);// 根据entry压缩实体获取到一个文件流
				byte[] b = new byte[fis.available()];
				fis.read(b);

				//创建一个文件夹
				File ff = new File("D:\\压缩文件");
				ff.mkdir();
				// 确定解压之后的文件路径
				File file = new File("D:\\压缩文件\\" + entry.getName());
				// 把文件放入到输出流中
				fos = new FileOutputStream(file);
				fos.write(b);
			}
			System.out.println("解压成功");
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
