package com.anju.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import com.anju.demo.mongo.model.Employee;
import com.anju.demo.repository.EmployeeRepositoryMongo;


@Service("userService")
@Profile("mongo")
public class MongoEmployeeService {
	
	@Autowired
	EmployeeRepositoryMongo empRepo;
	
	public List<Employee> getAllEmployees(){
		return empRepo.findAll();
	}

}
