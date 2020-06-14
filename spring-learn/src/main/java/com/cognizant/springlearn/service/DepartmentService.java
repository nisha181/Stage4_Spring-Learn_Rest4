package com.cognizant.springlearn.service;

import java.util.ArrayList;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cognizant.springlearn.Department;
import com.cognizant.springlearn.dao.DepartmentDao;

@Service
public class DepartmentService {
	
	@Autowired
	DepartmentDao departmentDao;
	
	private static final Logger LOGGER = LoggerFactory.getLogger(DepartmentService.class);
	
	public DepartmentService() {
		LOGGER.debug("Department Rest Service Called!");
	}

	
	public ArrayList<Department> getAllDepartments() {
		return departmentDao.getAllDepartmnts();
		
	}
}
