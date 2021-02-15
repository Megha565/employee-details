package com.spring.employeeDetail.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.spring.employeeDetail.dao.EmployeeDetailRepository;
import com.spring.employeeDetail.entity.Employee;

@Service
public class EmployeeDetailServiceImpl implements EmployeeDetailService {
	
	@Autowired
	EmployeeDetailRepository employeeDetailRepository;

	@Transactional
	public List<Employee> getAllEmployee() {
		List<Employee> employeeDetails = new ArrayList<>();
		employeeDetailRepository.queryBy().forEach(employeeDetails::add);
		return employeeDetails;
	}

}
