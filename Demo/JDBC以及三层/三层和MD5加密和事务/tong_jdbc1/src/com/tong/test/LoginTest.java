package com.tong.test;

import java.util.Scanner;

import com.tong.biz.LoginBiz;
import com.tong.biz.impl.LoginBizImpl;
import com.tong.entity.Login;

public class LoginTest {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("请输入用户名：");
		String name = scan.next();
		System.out.println("请输入密码：");
		String pwd = scan.next();
		
		Login login = new Login(name,pwd);
		LoginBiz loginBiz = new LoginBizImpl();
		//调用业务逻辑层的注册方法
		if(loginBiz.insertUser(login)!=0){
			System.out.println("注册成功");
		}else{
			System.out.println("注册失败");
		}
	}
}
