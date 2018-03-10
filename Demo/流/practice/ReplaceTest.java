package com.tong.stream.practice;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.io.Writer;

public class ReplaceTest {
	public static void main(String[] args) {
		Reader reader = null;
		BufferedReader br = null;
		Writer writer = null;
		BufferedWriter bw = null;

		try {
			//¶ÁÈ¡
			reader = new FileReader("d:\\hello.txt");
			br = new BufferedReader(reader);
			String str = null;
			StringBuffer sbf = new StringBuffer();
			while ((str = br.readLine()) != null) {
				sbf.append(str);
			}
			//Ìæ»»
			String newStr = sbf.toString().replace("{name}", "Å¼Å¼").replace("{type}", "Æó¶ì").replace("{master}", "ÐÇÐÇ");

			//Ð´Èë
			writer = new FileWriter("D:\\mmp\\hello.txt");
			bw = new BufferedWriter(writer);
			bw.write(newStr);
			System.out.println("Ìæ»»Ç°£º" + sbf);
			System.out.println("Ìæ»»ºó£º" + newStr);
			System.out.println("Ð´Èë³É¹¦");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				if (bw != null)
					bw.close();
				if (writer != null)
					writer.close();
				if (br != null)
					br.close();
				if (reader != null)
					reader.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
