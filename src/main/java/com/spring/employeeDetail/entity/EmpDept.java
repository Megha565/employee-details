package com.spring.employeeDetail.entity;

import javax.persistence.Column;

public class EmpDept {
	
	private int id;
	private String firstName;
	private String lastname;
	private String email;
	private String deptname;
	public EmpDept(int id, String firstName, String lastname, String email, String deptname) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastname = lastname;
		this.email = email;
		this.deptname = deptname;
	}
	public EmpDept() {
		
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getDeptname() {
		return deptname;
	}
	public void setDeptname(String deptname) {
		this.deptname = deptname;
	}
	
	

}
