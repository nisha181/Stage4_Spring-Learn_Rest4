package com.cognizant.springlearn.controller;

import java.util.ArrayList;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.cognizant.springlearn.Department;
import com.cognizant.springlearn.SpringLearnApplication;
import com.cognizant.springlearn.service.DepartmentService;

@Controller
public class DepartmentController {
	
	@Autowired
	DepartmentService departmentService;
	
	private static final Logger LOGGER = LoggerFactory.getLogger(SpringLearnApplication.class);
	
	@GetMapping("/departments")
	@ResponseBody
	public ArrayList<Department> getAllDepartments(){
		LOGGER.info("START");
		LOGGER.info("END");
		return departmentService.getAllDepartments();
	}

}
