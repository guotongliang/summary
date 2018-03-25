package com.tong.dao.impl;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.tong.dao.LoginDao;
import com.tong.entity.Login;
import com.tong.util.BaseDao;

public class LoginDaoImpl extends BaseDao implements LoginDao{

	/**
	 * 删除
	 */
	@Override
	public int deleteLogin(String username) {
		String sql = "delete from login where loginName = ?";
		Object[] obj = {username};
		return update(sql, obj);
	}

	/**
	 * 添加
	 */
	@Override
	public int insertLogin(String username, String pwd) {
		String sql = "insert into login(loginName,loginPwd) values (?,?)";
		Object[] obj = {username,pwd};
		return update(sql, obj);
	}

	/**
	 * 添加对象
	 */
	@Override
	public int insertLogin1(Login login) {
		String sql = "insert into login(loginName,loginPwd) values (?,?)";
		Object[] obj = {login.getLoginName(),login.getLoginPwd()};
		return update(sql, obj);
	}

	/**
	 * 查询所有信息
	 */
	@Override
	public List<Login> queryAll() {
		List<Login> list = new ArrayList<Login>();
		String sql = "select * from login";
		query(sql,null);
		try {
			while(rs.next()){
				//查询到一个对象
				Login login = new Login(rs.getString("loginName"), rs.getString("loginPwd"));
				//添加到集合中
				list.add(login);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			//调用关闭方法
			super.closeAll();
		}
		return list;
	}

	/**
	 * 登录
	 */
	@Override
	public Login login(Login login) {
		String sql = "select * from login where loginName=? and loginPwd = ?";
		Object[] obj = {login.getLoginName(),login.getLoginPwd()};
		query(sql, obj);
		Login login1 = null;
		try {
			if(rs.next()){
				login1 = new Login(rs.getString("loginName"), rs.getString("loginPwd"));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			closeAll();
		}
		return login1;
	}

}
