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
			fos= new FileOutputStream("d:\\hello.txt",true);//true保留原来的内容
			String str = "\n你猜呢";
			byte[] b=str.getBytes();//将字符转换成字节数组
			fos.write(b);
			System.out.println("写入成功");
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
