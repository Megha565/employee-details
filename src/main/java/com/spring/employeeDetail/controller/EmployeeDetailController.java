package com.spring.employeeDetail.controller;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.spring.employeeDetail.entity.Employee;
import com.spring.employeeDetail.service.EmployeeDetailService;



@RestController
@RequestMapping("/api")
public class EmployeeDetailController {
	
	private static final Logger LOG = LoggerFactory.getLogger(EmployeeDetailController.class);
	
	@Autowired
	public EmployeeDetailService employeeDetailService;
	
	@GetMapping("/employees")
	public List<Employee> getEmployeeList(){
		LOG.info("entered inside EmployeeDetailController::getEmployeeList");
		List<Employee> emplist = new ArrayList<>();
		emplist = employeeDetailService.getAllEmployee();
		LOG.info("before leaving EmployeeDetailController::getEmployeeList");
		return emplist;
	}

}
