package com.cognizant.springlearn.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Service;

import com.cognizant.springlearn.Country;
import com.cognizant.springlearn.service.exception.CountryNotFoundException;


@Service
public class CountryService {


	List<Country> countryList;
	
	public CountryService() {
		ApplicationContext context=new ClassPathXmlApplicationContext("country.xml");
		countryList=(List<Country>) context.getBean("countryList");
	}
	public Country getCountry(String code) throws CountryNotFoundException  {
		//ApplicationContext context=new ClassPathXmlApplicationContext("country.xml");
		//countryList=(List<Country>) context.getBean("countryList");
		for (Country country : countryList) {
			if(country.getCode().equalsIgnoreCase(code))
				return country;
			else {
				throw new CountryNotFoundException();
			}
		}
		return null;
	}
	public List<Country> addCountry(Country country) {
		countryList.add(country);
		return countryList;
	}
}
