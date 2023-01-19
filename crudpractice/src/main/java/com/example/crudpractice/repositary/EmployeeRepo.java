package com.example.crudpractice.repositary;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.crudpractice.model.Employee;

public interface EmployeeRepo extends  JpaRepository<Employee,Integer> {

	static void myCustomMethod(int id) {
		System.out.println("default custom method");
	}
	
}
