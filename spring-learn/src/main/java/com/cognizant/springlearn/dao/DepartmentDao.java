package com.cognizant.springlearn.dao;

import java.util.ArrayList;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Repository;

import com.cognizant.springlearn.Department;

@Repository
public class DepartmentDao {

	public static ArrayList<Department> DEPARTMENT_LIST;

	public DepartmentDao() {
		ApplicationContext context = new ClassPathXmlApplicationContext("employee.xml");
		DEPARTMENT_LIST = context.getBean("departmentList", ArrayList.class);
	}

	public ArrayList<Department> getAllDepartmnts() {
		return DEPARTMENT_LIST;
	}

}
