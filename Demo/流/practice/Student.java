package com.tong.stream.practice;

import java.io.Serializable;
/**
 * ���л�
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
	private transient int age;//transient�ؼ��ֵ����þ��ǲ��������л�����ô����Ͳ���д��
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
