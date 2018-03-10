package com.tong.stream;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

/**
 * FileReader:读取操作--输入流(字符流)
 * 
 * 对于频繁操作的，效率会比较低，所以此时应该用到缓冲流
 * 
 * 利用缓冲流，吧读取到的内容放到缓冲流中，只需要对缓冲流进行操作就可以了
 * 
 * @author Administrator
 *
 */
public class FileReaderTest {
	public static void main(String[] args) {
		Reader reader = null;
		try {
			reader = new FileReader("d:\\hello.txt");
			// 放在数组中
			char[] ch = new char[1024];
			int num = reader.read(ch);// 字符串的长度
			System.out.println(num);
			System.out.println(new String(ch, 0, num));
			// 为什么要写（0, num），因为是字符串的数组长度是1024，一共只有25个字符，所以只显示有的内容

			// 循环方法
			/*
			 * int num = 0; while((num = reader.read())!=-1){
			 * System.out.print((char)num); }
			 */
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				if (reader != null)
					reader.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
