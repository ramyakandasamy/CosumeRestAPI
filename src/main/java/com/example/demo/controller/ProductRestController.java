package com.example.demo.controller;

import java.net.URISyntaxException;
import java.util.HashMap;
import java.util.List;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.example.demo.service.ProducService;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

@RestController

public class ProductRestController {

	private static final Logger log = LoggerFactory.getLogger(ProductRestController.class);
	
	@Autowired
	
	ProducService productservice;

	/**
	 * @GetMapping("/getProducts")
	 * 
	 * @throws URISyntaxException
	 * @throws JsonProcessingException
	 * @throws JsonMappingException
	 * @ResponseBody public Product getProductDetails() { HttpHeaders headers = new
	 *               HttpHeaders(); headers.add("user-agent", "Application");
	 *               HttpEntity<String> entity = new HttpEntity<>(headers);
	 *               log.info("endpoint " + endpoint); Product productFound =
	 *               restTemplate.exchange(endpoint, HttpMethod.GET, entity,
	 *               Product.class).getBody();
	 * 
	 *               return productFound; }
	 **/

	@GetMapping("/getDetails")
	public List<HashMap<String, Object>> getDetails() throws JsonMappingException, JsonProcessingException
	{
		return productservice.getDetails();
		
	}

}
