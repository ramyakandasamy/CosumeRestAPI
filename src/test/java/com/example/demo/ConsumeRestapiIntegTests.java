package com.example.demo;


import static org.assertj.core.api.Assertions.assertThat;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.test.context.junit4.SpringRunner;


@RunWith(SpringRunner.class)
@SpringBootTest()
@ComponentScan("com.example.demo")
public class ConsumeRestapiIntegTests {
	
	
	
	 TestRestTemplate restTemplateobj = new TestRestTemplate();

	@Test
	public void testgetDetails() throws Exception {
		List todoList =new ArrayList();
		
		todoList = this.restTemplateobj.getForObject("http://localhost:8080/getDetails",List.class);
	
		//here you can specify your integeration  env url
		Assertions.assertNotNull(todoList);
		Assertions.assertFalse(todoList.isEmpty());
		Assertions.assertNotNull(todoList.get(0));
	}
	
	

}
