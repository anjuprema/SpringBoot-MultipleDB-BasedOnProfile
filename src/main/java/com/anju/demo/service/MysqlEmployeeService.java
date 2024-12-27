package com.anju.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import com.anju.demo.mysql.model.Employee;
import com.anju.demo.repository.EmployeeRepositoryMysql;

@Service("userService")
@Profile("mysql")
public class MysqlEmployeeService {
	
	@Autowired
	EmployeeRepositoryMysql empRepo;
	
	public List<Employee> getAllEmployees(){
		return empRepo.findAll();
	}

}
