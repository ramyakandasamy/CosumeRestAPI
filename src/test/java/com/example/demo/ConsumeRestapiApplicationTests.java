package com.example.demo;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;



import com.example.demo.service.ProducService;
import com.example.demo.service.ProductServiceImpl;


@RunWith(MockitoJUnitRunner.class)
public class ConsumeRestapiApplicationTests {

	@Mock
	ProductServiceImpl productServiceImplMock ;
	
	@InjectMocks
	ProducService producService;
	
	

	
	@Test
	public void testExecuteSuccess() throws Exception {

		
		Map<String,Object> data = new HashMap();
		
		

		data.put("test", "test");

		List dataList = new ArrayList();

		dataList.add(data);
		
	

		Mockito.when(productServiceImplMock.getDetails()).thenReturn(dataList);

		List<HashMap<String, Object>> response = producService.getDetails();

		Assert.assertNotNull(response.size());

	}

}
