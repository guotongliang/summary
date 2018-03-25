package com.tong.dao.impl;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.tong.dao.EmpDao;
import com.tong.entity.Emp;
import com.tong.util.BaseDao;

public class EmpDaoImpl extends BaseDao implements EmpDao {

	/**
	 * 删除
	 */
	@Override
	public int deleteEmp(String name) {
		String sql = "delete from emp where emp_name = ?";
		Object[] obj = {name};
		return update(sql, obj);
	}

	/**
	 * 添加
	 */
	@Override
	public int insertEmp(Emp emp) {
		String sql = "insert into emp (emp_name,emp_phone,dept_id) values (?,?,?)";
		Object[] obj = {emp.getEmp_name(),emp.getEmp_phone(),emp.getDept_id()};
		return update(sql, obj);
	}

	/**
	 * 修改
	 */
	@Override
	public int updateEmp(Emp emp) {
		String sql = "update emp set emp_name = ?,emp_phone = ?,dept_id = ? where emp_id =?";
		Object[] obj = {emp.getEmp_name(),emp.getEmp_phone(),emp.getDept_id(),emp.getEmp_id()};
		return update(sql, obj);
	}

	/**
	 * 查询所有信息
	 */
	@Override
	public List<Emp> queryAll() {
		List<Emp> list = new ArrayList<Emp>();
		Emp emp = null;
		String sql = "select emp_id,emp_name,emp_phone,dept_name from emp e inner join dept d on e.dept_id = d.dept_id";
		query(sql, null);
		try {
			while(rs.next()){
				emp = new Emp();
				emp.setEmp_id(rs.getInt("emp_id"));
				emp.setEmp_name(rs.getString("emp_name"));
				emp.setEmp_phone(rs.getString("emp_phone"));
				emp.setDept_name(rs.getString("dept_name"));
				list.add(emp);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			closeAll();
		}
		return list;
	}

	/**
	 * 根据ID查询信息
	 */
	@Override
	public Emp queryById(int id) {
		Emp emp = null;
		String sql = "select * from emp e inner join dept d where e.dept_id = d.dept_id and emp_id = ?";
		Object[] obj = {id};
		query(sql, obj);
		try {
			if(rs.next()){
				emp = new Emp();
				emp.setEmp_name(rs.getString("emp_name"));
				emp.setEmp_phone(rs.getString("emp_phone"));
				emp.setDept_name(rs.getString("dept_name"));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			closeAll();
		}
		return emp;
	}

	/**
	 * 根据姓名查询信息
	 */
	@Override
	public Emp queryByName(String name) {
		Emp emp = null;
		String sql = "select * from emp e inner join dept d where e.dept_id = d.dept_id and emp_name =?";
		Object[] obj = {name};
		query(sql, obj);
		try {
			if(rs.next()){
				emp = new Emp();
				emp.setEmp_id(rs.getInt("emp_id"));
				emp.setEmp_phone(rs.getString("emp_phone"));
				emp.setDept_name(rs.getString("dept_name"));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			closeAll();
		}
		return emp;
	}

}
