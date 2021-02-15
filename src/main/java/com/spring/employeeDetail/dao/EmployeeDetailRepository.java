package com.spring.employeeDetail.dao;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.spring.employeeDetail.entity.EmpDept;
import com.spring.employeeDetail.entity.Employee;

@Repository
public interface EmployeeDetailRepository extends CrudRepository<Employee, Integer> {
	
	
	@Query(value = "select employee.id, employee.first_name,employee.last_name,employee.email,"
			+ "department.dept_name,department.dept_id from employee join  department " + 
			"on employee.dept_id = department.dept_id;",nativeQuery = true)
	List<Employee> queryBy();

}
