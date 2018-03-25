package com.tong.biz.impl;

import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

import org.apache.log4j.Logger;

import com.tong.biz.LoginBiz;
import com.tong.dao.LoginDao;
import com.tong.dao.impl.LoginDaoImpl;
import com.tong.entity.Login;

public class LoginBizImpl implements LoginBiz {
	/*
	 * 哪个类想用就改成哪个类的名字就好
	 * log.info("添加成功");-----39行
	 * log.error("加密错误");-----43行
	 */
	Logger log = Logger.getLogger(LoginBizImpl.class);
	LoginDao loginDao = new LoginDaoImpl();
	@Override
	public int insertUser(Login login) {
		int result = 0;
		try {
			//加密过程
			//1.确定加密方式是MD5
			MessageDigest md = MessageDigest.getInstance("MD5");
			//2.将字符创转换成具体的哈希值
			byte[] md5 = md.digest(login.getLoginPwd().getBytes());
			//3.转换成大整数类型
			String newPwd = new BigInteger(1,md5).toString();
			
			//再把加密后的数据放回对象中
			login.setLoginPwd(newPwd);
			//调用数据访问层的方法
			result = loginDao.insertUser(login);
			if(result!=0){
				log.info("添加成功");
			}
		} catch (NoSuchAlgorithmException e) {
			e.printStackTrace();
			log.error("加密错误");
		}
		return result;
	}

}
