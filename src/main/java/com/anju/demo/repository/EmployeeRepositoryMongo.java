package com.anju.demo.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.context.annotation.Profile;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.mongodb.repository.MongoRepository;

import com.anju.demo.mongo.model.Employee;



@Profile("mongo")
public interface EmployeeRepositoryMongo extends MongoRepository<Employee, Integer> {
	
}
