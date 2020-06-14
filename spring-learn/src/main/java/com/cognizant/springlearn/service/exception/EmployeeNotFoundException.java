package com.cognizant.springlearn.service.exception;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

import com.cognizant.springlearn.SpringLearnApplication;

@ResponseStatus(value = HttpStatus.BAD_REQUEST, reason = "Employee not found")
public class EmployeeNotFoundException extends Exception {
	
	public EmployeeNotFoundException() {
		
	}

}
