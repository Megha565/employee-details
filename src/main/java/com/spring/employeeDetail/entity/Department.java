package com.spring.employeeDetail.entity;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;


@Entity
@Table(name="department")
public class Department {
	
	@Id	
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="dept_id")
	private int deptId;
	
	@Column(name="dept_name")
	private String deptname;
	
	@OneToMany(targetEntity = Employee.class, mappedBy = "id", orphanRemoval = false, fetch = FetchType.LAZY)
	  private List<Employee> employees;

	public Department(int deptId, String deptname) {
		super();
		this.deptId = deptId;
		this.deptname = deptname;
	}
	
	

	public Department() {
		
	}



	public int getDeptId() {
		return deptId;
	}

	public void setDeptId(int deptId) {
		this.deptId = deptId;
	}

	public String getDeptname() {
		return deptname;
	}

	public void setDeptname(String deptname) {
		this.deptname = deptname;
	}

	@JsonIgnore
	public List<Employee> getEmployees() {
		return employees;
	}

	public void setEmployees(List<Employee> employees) {
		this.employees = employees;
	}



	@Override
	public String toString() {
		return "Department [deptId=" + deptId + ", deptname=" + deptname + ", employees=" + employees + "]";
	}
	 
	 

}
