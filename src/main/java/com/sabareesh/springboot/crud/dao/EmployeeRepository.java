package com.sabareesh.springboot.crud.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sabareesh.springboot.crud.entity.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {

	
	
}
