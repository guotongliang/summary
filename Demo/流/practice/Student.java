package com.tong.stream.practice;

import java.io.Serializable;
/**
 * 序列化
 * @author Administrator
 *
 */

public class Student implements Serializable{

	public Student() {
	}

	public Student(String name, int age, String sex) {
		this.name = name;
		this.age = age;
		this.sex = sex;
	}

	private String name;
	private transient int age;//transient关键字的作用就是不进行序列化，那么年龄就不能写入
	private String sex;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}
}
