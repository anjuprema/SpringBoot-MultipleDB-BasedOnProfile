package com.anju.demo.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.context.annotation.Profile;
import org.springframework.data.jpa.repository.JpaRepository;

import com.anju.demo.mysql.model.Employee;


@Profile("mysql")
public interface EmployeeRepositoryMysql extends JpaRepository<Employee, Integer> {
	
}
