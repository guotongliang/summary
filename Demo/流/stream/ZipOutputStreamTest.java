package com.tong.stream;
/**
 * ZipOutputStream压缩流--压缩文件
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
		File zipFile = new File("d:\\压缩文件.zip");
		
		OutputStream fos = null;
		ZipOutputStream zos = null;
		InputStream fis = null;
		try {
			//将内容写入到压缩文件中
			fos = new FileOutputStream(zipFile);
			zos = new ZipOutputStream(fos);
			File[] files = file.listFiles();//获取mmp文件夹下所有的文件
			for (File f : files) {
				fis = new FileInputStream(f);
				byte[] b = new byte[fis.available()];
				fis.read(b);//读取的内容放到字节数组b中
				//调用putNextEntry方法，设置每一个压缩实体的文件名
				zos.putNextEntry(new ZipEntry(f.getName()));
				//写入
				zos.write(b);
			}
			System.out.println("压缩成功");
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
