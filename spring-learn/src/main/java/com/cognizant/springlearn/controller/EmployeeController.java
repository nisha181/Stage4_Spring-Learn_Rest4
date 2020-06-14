package com.cognizant.springlearn.controller;

import java.util.ArrayList;

import javax.validation.Valid;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.cognizant.springlearn.Employee;
import com.cognizant.springlearn.SpringLearnApplication;
import com.cognizant.springlearn.dao.EmployeeDao;
import com.cognizant.springlearn.service.EmployeeService;
import com.cognizant.springlearn.service.exception.EmployeeNotFoundException;

@RestController
public class EmployeeController {
	
	@Autowired
	EmployeeService employeeService;
	
	
	
	private static final Logger LOGGER = LoggerFactory.getLogger(SpringLearnApplication.class);
	
	@GetMapping("/employees")
	public ArrayList<Employee> getAllEmployees(){
		LOGGER.info("START");
		LOGGER.info("END");
		return employeeService.getAllEmployees();
	}
	@PutMapping("/employees")
	public ArrayList<Employee> updateEmployee(@RequestBody @Valid Employee employee) throws EmployeeNotFoundException  {
		LOGGER.info("START");
		
		//LOGGER.debug("Employee : {}",employee);
		LOGGER.info("END");
		return employeeService.updateEmployee(employee);
		
	}
	@DeleteMapping("/employees/{id}")
	public ArrayList<Employee> deleteEmployee(@PathVariable String id) throws EmployeeNotFoundException {
		LOGGER.info("Start");
		LOGGER.info(id);
		
		//LOGGER.debug("Employee List After Deletions:{}", employeeService.getAllEmployees());
		LOGGER.info("End");
		return employeeService.deleteEmployee(id);
	}
	

}
