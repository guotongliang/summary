package com.tong.dao.impl;

import com.tong.dao.LoginDao;
import com.tong.entity.Login;
import com.tong.util.BaseDao;

public class LoginDaoImpl extends BaseDao implements LoginDao{

	@Override
	public int insertUser(Login login) {
		String sql = "insert into login (loginName,loginPwd) values(?,?)";
		Object[] obj = {login.getLoginName(),login.getLoginPwd()};
		return update(sql, obj);
	}

}
