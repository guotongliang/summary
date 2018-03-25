package com.tong.dao;

import java.util.List;

import com.tong.entity.Login;

public interface LoginDao {
	//删除
	int deleteLogin(String username);
	
	//添加
	int insertLogin(String username,String pwd);
	int insertLogin1(Login login);
	
	//查询所有信息
	List<Login> queryAll();
	
	//登录
	Login login(Login login);
}
