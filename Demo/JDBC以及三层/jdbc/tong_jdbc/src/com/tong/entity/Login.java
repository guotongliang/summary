package com.tong.entity;

/**
 * 登录表
 * 
 * @author Administrator
 *
 */
public class Login {

	public Login() {}

	public Login(String loginName, String loginPwd) {
		this.loginName = loginName;
		this.loginPwd = loginPwd;
	}

	private String loginName;
	private String loginPwd;

	public String getLoginName() {
		return loginName;
	}

	public void setLoginName(String loginName) {
		this.loginName = loginName;
	}

	public String getLoginPwd() {
		return loginPwd;
	}

	public void setLoginPwd(String loginPwd) {
		this.loginPwd = loginPwd;
	}

}
