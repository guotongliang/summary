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
			//��ȡ
			reader = new FileReader("d:\\hello.txt");
			br = new BufferedReader(reader);
			String str = null;
			StringBuffer sbf = new StringBuffer();
			while ((str = br.readLine()) != null) {
				sbf.append(str);
			}
			//�滻
			String newStr = sbf.toString().replace("{name}", "żż").replace("{type}", "���").replace("{master}", "����");

			//д��
			writer = new FileWriter("D:\\mmp\\hello.txt");
			bw = new BufferedWriter(writer);
			bw.write(newStr);
			System.out.println("�滻ǰ��" + sbf);
			System.out.println("�滻��" + newStr);
			System.out.println("д��ɹ�");
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
