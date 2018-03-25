package com.tong.test;

import java.util.List;
import java.util.Scanner;

import com.tong.biz.EmpBiz;
import com.tong.biz.impl.EmpBizImpl;
import com.tong.entity.Emp;

public class Test {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		EmpBiz empbiz = new EmpBizImpl();
		
		/*System.out.println("请输入您要删除的员工姓名：");
		String name = scan.next();
		if(empbiz.deleteEmp(name)!=0){
			System.out.println("删除成功");
		}else{
			System.out.println("删除失败");
		}*/
		
		
		/*System.out.println("请输入员工姓名：");
		String name = scan.next();
		System.out.println("请输入员工电话：");
		String phone = scan.next();
		System.out.println("请输入部门ID：");
		int dept = scan.nextInt();
		Emp emp = new Emp(name, phone, dept);
		//调用业务逻辑层的添加的方法
		if(empbiz.insertEmp(emp)!=0){
			System.out.println("添加成功");
		}else{
			System.out.println("该员工已存在");
		}*/
		
		/*List<Emp> list = empbiz.queryAll();
		for (Emp emp : list) {
			System.out.println(emp.getEmp_id()+"---"+emp.getEmp_name()+"---"+emp.getEmp_phone()+"---"+emp.getDept_name());
		}*/
		
		
		/*System.out.println("请输入员工id:");
		int id = scan.nextInt();
		Emp emp = null;
		if((emp = empbiz.queryById(id))!=null){
			System.out.println(emp.getEmp_name()+"---"+emp.getEmp_phone()+"---"+emp.getDept_name());
		}else{
			System.out.println("未找到");
		}*/
		
		/*System.out.println("请输入员工姓名:");
		String name = scan.next();
		Emp emp = null;
		if((emp = empbiz.queryByName(name))!=null){
			System.out.println(emp.getEmp_id()+"---"+emp.getEmp_phone()+"---"+emp.getDept_name());
		}else{
			System.out.println("未找到");
		}*/
		
		
		System.out.println("请输入员工ID：");
		int id = scan.nextInt();
		System.out.println("请输入修改后的姓名：");
		String name = scan.next();
		System.out.println("请输入修改后的电话：");
		String phone = scan.next();
		System.out.println("请输入修改后的部门ID：");
		int did = scan.nextInt();
		Emp emp = new Emp(id, name, phone, did);
		if(empbiz.update(emp)!=0){
			System.out.println("修改成功");
		}else{
			System.out.println("修改失败");
		}
	}
}
