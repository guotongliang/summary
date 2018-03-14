package com.tong.other;

import java.util.Scanner;

public class StringTest {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("请输入一个字符串：");
		String str = scan.next();
		/*
		 * 正则表达式以"^"开头，以"$"结尾,前后不能有空格 
		 * 如果要输入字符串，一定要记得"+"号;;
		 * "+"任意长度的字符
		 * 或者{2,5}这样限制2到5个字符 
		 * "^1[0-9A-Za-z]{6,10}$"除去前面的1，后边还有6到10位
		 */

		// 1. \d表示只能输入0-9的数字 \w表示输入数字，字母，下划线
		// 2. [0-9A-Za-z]
		/*
		 * 日期 
		 * "^[0-9]{4}-[0-9]{1,2}-[0-9]{1,2}$" 
		 * "^[0-9]{4}(-[0-9]{1,2}){2}$"
		 * 效果一样
		 */
		if (!str.matches("^[0-9]{4}(-[0-9]{1,2}){2}$")) {
			System.out.println("格式错误");
		} else {
			System.out.println(str);
		}
	}
}
