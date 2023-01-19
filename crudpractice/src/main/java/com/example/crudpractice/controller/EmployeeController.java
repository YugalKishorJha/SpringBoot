package com.example.crudpractice.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.crudpractice.model.Employee;
import com.example.crudpractice.repositary.EmployeeRepo;

@RestController
public class EmployeeController {

	@Autowired
	EmployeeRepo employeeRepo;

	@GetMapping("/getEmployeeById/{id}")
	ResponseEntity<Employee> getEmployeeById(@PathVariable int id) {
		Optional<Employee> employee = employeeRepo.findById(id);
		if (employee.isPresent())
			return new ResponseEntity<Employee>(employee.get(), HttpStatus.OK);

		return new ResponseEntity<Employee>(HttpStatus.NO_CONTENT);

	}

	@GetMapping("/getAllEmployees")
	ResponseEntity<List<Employee>> getAllEmployees() {
		List<Employee> employees = employeeRepo.findAll();

		if (employees.isEmpty())
			return new ResponseEntity<List<Employee>>(HttpStatus.NO_CONTENT);

		return new ResponseEntity<List<Employee>>(employees, HttpStatus.OK);

	}

	@DeleteMapping("/deleteEmployee/{id}")
	ResponseEntity<HttpStatus> deleteEmployee(@PathVariable int id) {
		List<Employee> employees = employeeRepo.findAll();
		if (employees.stream().map(e -> e.getId()).anyMatch(presentId -> presentId == id)) {
			employeeRepo.deleteById(id);
			return new ResponseEntity<HttpStatus>(HttpStatus.OK);
		}
		
		return new ResponseEntity<HttpStatus>(HttpStatus.NO_CONTENT);
	}

	@PutMapping("/updateEmployee/{id}")
	ResponseEntity<Employee> updateEmployee(@PathVariable int id, @RequestBody Employee emp) {
		Optional<Employee> updatedEmp = employeeRepo.findById(id);
		Employee employeeUpdated = updatedEmp.get();
		if (updatedEmp.isEmpty())
			return new ResponseEntity<Employee>(HttpStatus.NO_CONTENT);

		employeeUpdated.setName(emp.getName());
		employeeUpdated.setSal(emp.getSal());
		employeeUpdated.setMobileNo(emp.getMobileNo());
		employeeUpdated.setEmail(emp.getEmail());
		employeeUpdated.setAge(emp.getAge());
		employeeUpdated.setNationality(emp.getNationality());

		return new ResponseEntity<Employee>(employeeUpdated, HttpStatus.OK);

	}

	@PostMapping("/saveEmployee")
	ResponseEntity<Employee> saveEmployee(@RequestBody Employee emp) {

		Employee savedEmployee = employeeRepo.save(emp);
		return new ResponseEntity<Employee>(savedEmployee, HttpStatus.OK);

	}

}
