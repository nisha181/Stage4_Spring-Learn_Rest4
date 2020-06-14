package com.cognizant.springlearn.dao;

import java.util.ArrayList;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Repository;

import com.cognizant.springlearn.Employee;
import com.cognizant.springlearn.service.exception.EmployeeNotFoundException;

@Repository
public class EmployeeDao {

	private static ArrayList<Employee> EMPLOYEE_LIST;
	
	private static final Logger LOGGER = LoggerFactory.getLogger(EmployeeDao.class);
	
	public EmployeeDao() {
		ApplicationContext context=new ClassPathXmlApplicationContext("employee.xml");
		EMPLOYEE_LIST=context.getBean("employeeList",ArrayList.class);
	}

	public ArrayList<Employee> getAllEmployees() {
		return EMPLOYEE_LIST;
	}
	
	 public ArrayList<Employee> updateEmployee(Employee employee) throws EmployeeNotFoundException{
		 LOGGER.info("Start");
		 LOGGER.debug("Employee: {} ", EMPLOYEE_LIST);
		 for(Employee emp : EMPLOYEE_LIST) {
			 if(emp.getId().equals(employee.getId())) {
				 emp.setId(employee.getId());
				 emp.setName(employee.getName());
				 emp.setDateOfBirth(employee.getDateOfBirth());
				 emp.setDept(employee.getDept());
				 emp.setSalary(employee.getSalary());
				 break;
			 }
			 else
				 throw new EmployeeNotFoundException();
		 }
			LOGGER.info("End");
			return EMPLOYEE_LIST;
		 
	 }
	 
	 public ArrayList<Employee> deleteEmployee(String id) throws EmployeeNotFoundException {
			LOGGER.info("Start");
			 LOGGER.debug("Employee: {} ", EMPLOYEE_LIST);
			for (Employee emp : EMPLOYEE_LIST) {
				if(emp.getId().equals(id)) {
					LOGGER.debug("Employee : {} ", emp);
					EMPLOYEE_LIST.remove(emp);
					//LOGGER.debug("Employee : {} ", EMPLOYEE_LIST);
					break;
					
				}
				else
					throw new EmployeeNotFoundException();
			}
			
			LOGGER.info("End");
			return EMPLOYEE_LIST;
		}
}
