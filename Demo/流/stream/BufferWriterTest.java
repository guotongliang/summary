package com.tong.stream;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class BufferWriterTest {
	public static void main(String[] args) {
		Writer writer = null;
		BufferedWriter bw = null;

		try {
			writer = new FileWriter("D:\\hello.txt", true);
			bw = new BufferedWriter(writer);
			bw.write("\r\n今天继续");
			System.out.println("写入成功");

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				if (bw != null)
					bw.close();
				if (writer != null)
					writer.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
