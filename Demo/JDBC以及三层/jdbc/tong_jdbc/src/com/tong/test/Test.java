package com.tong.test;

import java.util.ArrayList;
import java.util.List;

import com.tong.dao.impl.LoginDaoImpl;
import com.tong.entity.Login;

public class Test {
	public static void main(String[] args) {
		LoginDaoImpl impl = new LoginDaoImpl();
		
		
		/*if(impl.deleteLogin("admin")!=0){
			System.out.println("删除成功");
		}else{
			System.out.println("删除失败");
		}*/
		
		/*if(impl.insertLogin("admin", "admin")!=0){
			System.out.println("添加成功");
		}else{
			System.out.println("添加失败");
		}*/
		
		
		/*Login login = new Login("tom", "tom");
		if(impl.insertLogin1(login)!=0){
			System.out.println("添加成功");
		}else{
			System.out.println("添加失败");
		}*/
		
		
		//显示所有的信息
		List<Login> list = impl.queryAll();
		for (Login login : list) {
			System.out.println(login.getLoginName()+"----"+login.getLoginPwd());
		}
		
		
		
		
	}
}
