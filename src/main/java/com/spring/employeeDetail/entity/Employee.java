package com.spring.employeeDetail.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name="employee")
public class Employee implements Serializable {

@Id	
@GeneratedValue(strategy=GenerationType.IDENTITY)
@Column(name="id")
private int id;

@Column(name="first_name")
private String firstName;
@Column(name="last_name")
private String lastname;
@Column(name="email")
private String email;
@Column(name="dept_id")
private int deptId;

@Column(name="dept_name")
private String deptname;

@ManyToOne(targetEntity = Department.class )
@JoinColumn(name = "dept_id", insertable = false, updatable = false)//@Fetch(FetchMode.JOIN)
private Department department;

public Employee() {
	
}

public Employee( String firstName, String lastname, String email) {
	super();
	
	this.firstName = firstName;
	this.lastname = lastname;
	this.email = email;
}



public Employee(int id, String firstName, String lastname, String email, int deptId, String deptname,
		Department department) {
	super();
	this.id = id;
	this.firstName = firstName;
	this.lastname = lastname;
	this.email = email;
	this.deptId = deptId;
	this.deptname = deptname;
	this.department = department;
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


@JsonIgnore
public Department getDepartment() {
	return department;
}

public void setDepartment(Department department) {
	this.department = department;
}

@Override
public String toString() {
	return "Employee [id=" + id + ", firstName=" + firstName + ", lastname=" + lastname + ", email=" + email + "]";
}




}
