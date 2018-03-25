package com.tong.biz.impl;

import java.util.List;

import com.tong.biz.EmpBiz;
import com.tong.dao.EmpDao;
import com.tong.dao.impl.EmpDaoImpl;
import com.tong.entity.Emp;

public class EmpBizImpl implements EmpBiz {

	EmpDao empdao = new EmpDaoImpl();
	
	/**
	 * 删除
	 */
	@Override
	public int deleteEmp(String name) {
		return empdao.deleteEmp(name);
	}

	/**
	 * 添加
	 */
	@Override
	public int insertEmp(Emp emp) {
		//判断要添加的用户是否存在
		if(empdao.queryByName(emp.getEmp_name())==null){
			//说明不存在，执行添加
			return empdao.insertEmp(emp);
		}
		return 0;
	}

	/**
	 * 查询所有信息
	 */
	@Override
	public List<Emp> queryAll() {
		return empdao.queryAll();
	}

	/**
	 * 根据ID查询信息
	 */
	@Override
	public Emp queryById(int id) {
		return empdao.queryById(id);
	}

	/**
	 * 根据姓名查询信息
	 */
	@Override
	public Emp queryByName(String name) {
		return empdao.queryByName(name);
	}

	/**
	 * 根据员工ID修改信息
	 */
	@Override
	public int update(Emp emp) {
		if(empdao.queryById(emp.getEmp_id())!=null){
			return empdao.updateEmp(emp);
		}
		return 0;
	}

}
