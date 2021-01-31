package com.example.demo.service;

import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;

@Service
public class ProducService {
	
	@Autowired
	ProductServiceImpl ProductServiceImpl;
	
	public List<HashMap<String, Object>> getDetails() throws JsonMappingException, JsonProcessingException{
		List<HashMap<String, Object>> data= ProductServiceImpl.getDetails();
		
		return data;
	}

}
