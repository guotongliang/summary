package com.tong.stream.practice;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
/*
 * 现在还有这样的一个异常
 * java.io.EOFException
 * at java.io.ObjectInputStream$BlockDataInputStream.peekByte(Unknown Source)
 * at java.io.ObjectInputStream.readObject0(Unknown Source)
 * at java.io.ObjectInputStream.readObject(Unknown Source)
 * at com.tong.stream.practice.ObjectInputStreamTest.main(ObjectInputStreamTest.java:18)

 */
public class ObjectInputStreamTest {
	public static void main(String[] args) {
		InputStream fis = null;
		ObjectInputStream ois = null;

		try {
			fis = new FileInputStream("D:\\Student.txt");
			ois = new ObjectInputStream(fis);
			Student stu = null;
			while((stu=(Student)ois.readObject())!=null){
				System.out.println(stu.getName() + "-" + stu.getAge() + "-" + stu.getSex());
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} finally {
			try {
				if (ois != null)
					ois.close();
				if (fis != null)
					fis.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}
