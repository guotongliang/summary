package com.tong.biz;

import java.util.List;

import com.tong.entity.Emp;

/**
 * 业务逻辑层
 * @author Administrator
 *
 */
public interface EmpBiz {
	int deleteEmp(String name);
	int insertEmp(Emp emp);
	List<Emp> queryAll();
	Emp queryById(int id);
	Emp queryByName(String name);
	int update(Emp emp);
}
