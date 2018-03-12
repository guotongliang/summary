package com.tong.filetest;

import java.io.File;
import java.io.IOException;

public class FileTest {
	public static void main(String[] args) {
		File file = new File("D:\\hello.txt");//或者写成d:\\hello.txt
		if(file.exists()){
			System.out.println("存在");
			if(file.isFile()){
				System.out.println("是文件");
				//得到文件地址
				System.out.println(file.getPath());//相对路径
				System.out.println(file.getAbsolutePath());//绝对路径
				System.out.println(file.getName());
				System.out.println("长度："+file.length());
				//字母一个字节
				//汉字两个字节
				//回车两个字节
				//删除了指定目录下的文件
				//file.delete();
				
			}
			if(file.isDirectory()){
				System.out.println("是目录");
			}
		}else{
			System.out.println("不存在");
			try {
				file.createNewFile();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
