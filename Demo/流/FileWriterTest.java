package com.tong.stream;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

/**
 * FileWriter:输出流-写入操作
 * 
 * @author Administrator
 *
 */
public class FileWriterTest {
	public static void main(String[] args) {
		Writer writer = null;
		try {
			writer = new FileWriter("D:\\hello.txt", true);
			String str = "I like lili";
			writer.write(str);
			System.out.println("写入成功");

		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if (writer != null)
					writer.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}
}
