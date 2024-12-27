package com.anju.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.anju.demo.mongo.model.Employee;
import com.anju.demo.service.MongoEmployeeService;
import com.anju.demo.service.MysqlEmployeeService;

@RestController
@RequestMapping("")
public class RestControllerMultipleDB {
	
	private final Object userService;

    @Autowired
    public RestControllerMultipleDB(@Qualifier("userService") Object userService) {
        this.userService = userService;
    }
	
	@GetMapping("/hello")
	public String sayHello() {
		return "Hello! Anju..";
	}
	
	@GetMapping("/listEmployee")
	public List saveEmployee() {
		if (userService instanceof MongoEmployeeService) {
            List<com.anju.demo.mongo.model.Employee> emp = ((MongoEmployeeService) userService).getAllEmployees();
            System.out.println(emp);
            return emp;
        } else if (userService instanceof MysqlEmployeeService) {
        	List<com.anju.demo.mysql.model.Employee> emp = ((MysqlEmployeeService) userService).getAllEmployees();
        	System.out.println(emp);
        	return emp;
        }else {
        	throw new IllegalStateException("Unknown profile!");
        }       
	}
}
