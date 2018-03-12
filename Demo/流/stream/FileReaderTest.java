package com.tong.stream;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

/**
 * FileReader:��ȡ����--������(�ַ���)
 * 
 * ����Ƶ�������ģ�Ч�ʻ�Ƚϵͣ����Դ�ʱӦ���õ�������
 * 
 * ���û��������ɶ�ȡ�������ݷŵ��������У�ֻ��Ҫ�Ի��������в����Ϳ�����
 * 
 * @author Administrator
 *
 */
public class FileReaderTest {
	public static void main(String[] args) {
		Reader reader = null;
		try {
			reader = new FileReader("d:\\hello.txt");
			// ����������
			char[] ch = new char[1024];
			int num = reader.read(ch);// �ַ����ĳ���
			System.out.println(num);
			System.out.println(new String(ch, 0, num));
			// ΪʲôҪд��0, num������Ϊ���ַ��������鳤����1024��һ��ֻ��25���ַ�������ֻ��ʾ�е�����

			// ѭ������
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
