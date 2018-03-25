package com.tong.entity;

/**
 * 实体类
 * 
 * @author Administrator
 *
 */
public class Emp {
	public Emp() {
	}

	public Emp(String emp_name, String emp_phone, int dept_id) {
		this.emp_name = emp_name;
		this.emp_phone = emp_phone;
		this.dept_id = dept_id;
	}
	

	public Emp(int emp_id, String emp_name, String emp_phone, int dept_id) {
		this.emp_id = emp_id;
		this.emp_name = emp_name;
		this.emp_phone = emp_phone;
		this.dept_id = dept_id;
	}


	private int emp_id;
	private String emp_name;
	private String emp_phone;
	private int dept_id;
	private String dept_name;

	public int getEmp_id() {
		return emp_id;
	}

	public void setEmp_id(int emp_id) {
		this.emp_id = emp_id;
	}

	public String getEmp_name() {
		return emp_name;
	}

	public void setEmp_name(String emp_name) {
		this.emp_name = emp_name;
	}

	public String getEmp_phone() {
		return emp_phone;
	}

	public void setEmp_phone(String emp_phone) {
		this.emp_phone = emp_phone;
	}

	public int getDept_id() {
		return dept_id;
	}

	public void setDept_id(int dept_id) {
		this.dept_id = dept_id;
	}

	public String getDept_name() {
		return dept_name;
	}

	public void setDept_name(String dept_name) {
		this.dept_name = dept_name;
	}

}
