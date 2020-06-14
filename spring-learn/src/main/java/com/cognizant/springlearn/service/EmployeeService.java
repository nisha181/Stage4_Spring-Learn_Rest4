package com.cognizant.springlearn.service;

import java.util.ArrayList;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.cognizant.springlearn.Employee;
import com.cognizant.springlearn.dao.EmployeeDao;
import com.cognizant.springlearn.service.exception.EmployeeNotFoundException;

@Service
public class EmployeeService {
	
	@Autowired
	EmployeeDao employeeDao;
	
	private static final Logger LOGGER = LoggerFactory.getLogger(EmployeeService.class);
	
	public EmployeeService() {
		LOGGER.debug("Employee Rest Service Called!");
	}

	
	public ArrayList<Employee> getAllEmployees() {
		return employeeDao.getAllEmployees();
		
	}
	
	public ArrayList<Employee> updateEmployee(Employee employee) throws EmployeeNotFoundException {
		return employeeDao.updateEmployee(employee);
	}
	
	public ArrayList<Employee> deleteEmployee(String id) throws EmployeeNotFoundException {
		return employeeDao.deleteEmployee(id);
	}
}
