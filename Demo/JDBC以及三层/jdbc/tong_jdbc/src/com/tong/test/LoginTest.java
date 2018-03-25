package com.tong.test;

import java.util.Scanner;

import com.tong.dao.impl.LoginDaoImpl;
import com.tong.entity.Login;

public class LoginTest {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		LoginDaoImpl impl = new LoginDaoImpl();
		System.out.println("请输入用户名：");
		String name = scan.next();
		System.out.println("请输入密码：");
		String pwd = scan.next();
		Login login = new Login(name, pwd);
		//调用登录方法
		if(impl.login(login)!=null){
			System.out.println("登录成功");
		}else{
			System.out.println("登录失败");
		}
	}
}
