package com.tong.yield;

public class Test {
	public static void main(String[] args) {
		StudentThread st = new StudentThread("学生");
		TeacherThread tt = new TeacherThread("老师");
		st.start();
		tt.start();
	}
}
