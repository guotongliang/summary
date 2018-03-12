package com.tong.stream.practice;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.OutputStream;

public class ObjectOutputStreamTest {
	public static void main(String[] args) {
		OutputStream fos = null;
		ObjectOutputStream oos = null;
		 try {
			fos = new FileOutputStream("d:\\student.txt");
			oos = new ObjectOutputStream(fos);
			oos.writeObject(new Student("张三", 20, "男"));
			oos.writeObject(new Student("李四", 21, "女"));
			oos.writeObject(new Student("王五", 22, "男"));
			System.out.println("写入成功");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			try {
				if(oos!=null) oos.close();
				if(fos!=null) fos.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		 
	}
}
