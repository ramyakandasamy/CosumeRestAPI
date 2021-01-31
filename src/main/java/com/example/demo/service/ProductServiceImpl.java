package com.example.demo.service;

import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

@Service
public class ProductServiceImpl {
	
	
	@Value("${endpoint}")
	String endpoint;
	@Autowired
	RestTemplate restTemplate;
	@Bean
	public RestTemplate restTemplate(RestTemplateBuilder builder) {
		return builder.build();
	}

	public List<HashMap<String, Object>> getDetails() throws JsonMappingException, JsonProcessingException {
		HttpHeaders headers = new HttpHeaders();
		headers.add("user-agent", "Application");
		HttpEntity<String> entity = new HttpEntity<>(headers);
		
		ResponseEntity<String> responseEntity = restTemplate.exchange(endpoint, HttpMethod.GET, entity, String.class);
		String data = responseEntity.getBody();
		System.out.println("data ==  " + data);
		ObjectMapper mapper = new ObjectMapper();
		List<HashMap<String, Object>> dataAsMap = mapper.readValue(data, List.class);
		return dataAsMap;
	}

}
