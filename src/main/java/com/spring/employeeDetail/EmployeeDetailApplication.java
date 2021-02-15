package com.spring.employeeDetail;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@ComponentScan({"com.spring.employeeDetail"})
@EntityScan("com.spring.employeeDetail")
@EnableJpaRepositories("com.spring.employeeDetail")
public class EmployeeDetailApplication {

	public static void main(String[] args) {
		SpringApplication.run(EmployeeDetailApplication.class, args);
	}

}
