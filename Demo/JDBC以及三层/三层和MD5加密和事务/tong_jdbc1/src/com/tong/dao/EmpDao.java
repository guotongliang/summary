package com.tong.dao;

import java.util.List;

import com.tong.entity.Emp;

/**
 * 数据访问层的接口
 * @author Administrator
 *
 */
public interface EmpDao{
	//删除
	int deleteEmp(String name);
	//添加
	int insertEmp(Emp emp);
	//修改
	int updateEmp(Emp emp);
	//查询所有信息
	List<Emp> queryAll();
	//根据ID查询
	Emp queryById(int id);
	//根据姓名查询
	Emp queryByName(String name);
}
