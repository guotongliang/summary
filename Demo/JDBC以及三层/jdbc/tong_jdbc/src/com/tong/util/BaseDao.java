package com.tong.util;
/**
 * 工具类
 * @author Administrator
 *
 */

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class BaseDao {
	private final String DRIVER = "com.mysql.jdbc.Driver";
	private final String URL = "jdbc:mysql://localhost:3306/dbname";
	private final String USERNAME = "root";
	private final String PASSWORD = "123";
	public Connection con = null;
	public PreparedStatement pstm = null;
	public ResultSet rs = null;

	/**
	 * 创建连接
	 */
	public void getConnection() {
		try {
			Class.forName(DRIVER);
			con = DriverManager.getConnection(URL, USERNAME, PASSWORD);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	/**
	 * 关闭
	 */
	public void closeAll() {
		try {
			if (rs != null)
				rs.close();
			if (pstm != null)
				pstm.close();
			if (con != null)
				con.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	/**
	 * 增删改
	 * 
	 * @param sql
	 * @param obj
	 * @return
	 */
	public int update(String sql, Object[] obj) {
		int result = 0;// 增删改成功与否的结果
		getConnection();
		try {
			// insert into dept (dept_name) values(?);
			// delete from emp where emp_id =?;
			// update emp set emp_name = ?,emp_phone=? where emp_id=?;
			pstm = con.prepareStatement(sql);
			if (obj != null) {
				for (int i = 0; i < obj.length; i++) {
					pstm.setObject(i + 1, obj[i]);// "i+1"也就是emp_name等的位置从1开始的，不像数组等
				}
			}
			// 调用方法执行sql语句
			result = pstm.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			// 关闭
			closeAll();
		}
		return result;
	}

	/**
	 * 查询
	 * 
	 * @param sql
	 * @param obj
	 */
	public void query(String sql, Object[] obj) {
		getConnection();
		try {
			pstm = con.prepareStatement(sql);
			if (obj != null) {
				for (int i = 0; i < obj.length; i++) {
					pstm.setObject(i + 1, obj[i]);
				}
			}
			rs = pstm.executeQuery();
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

}
