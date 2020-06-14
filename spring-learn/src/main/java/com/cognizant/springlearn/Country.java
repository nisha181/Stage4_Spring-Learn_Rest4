package com.cognizant.springlearn;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;


public class Country {
	private static final Logger LOGGER = LoggerFactory.getLogger(SpringLearnApplication.class); 
	
	@NotNull 
	@Size(min=2, max=2, message="Country code should be 2 characters") 
	private String code;
	private String name;
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		LOGGER.debug("Set Code : {} " ,code);
		this.code = code;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		LOGGER.debug("Set Name : {} ", name);
		this.name = name;
	}
	public Country() {
		super();
		LOGGER.debug("Inside Country Constructor.");
		
	}
	@Override
	public String toString() {
		return "Country [code=" + code + ", name=" + name + "]";
	}
	

}
