package com.tong.yield;

public class Test {
	public static void main(String[] args) {
		StudentThread st = new StudentThread("ѧ��");
		TeacherThread tt = new TeacherThread("��ʦ");
		st.start();
		tt.start();
	}
}
