package com.mss.calender.controller;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.springframework.http.MediaType;
import org.springframework.mock.web.MockHttpServletResponse;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import com.mss.calender.ApplicationTest;

public class MainControllerTest extends ApplicationTest {
	


	
		@Test
		public void getTest() throws Exception {
		// when(employeeRepo.findAll()).thenReturn(Collections.emptyList());

		MvcResult mvcResult = mockMvc.perform( // using mock mvc builder we can handle the mockMvc
		MockMvcRequestBuilders.get("/api/resources").accept(MediaType.APPLICATION_JSON)).andReturn();

		MockHttpServletResponse response = mvcResult.getResponse();
		assertEquals(200, response.getStatus()); // HttpStatus.OK.value()=200, HttpStatus.CREATED.value()=201
		System.out.println("Response:" + response.getContentAsString());

		// verify(employeeRepo).findAll();
		}
		
		@Test
		public void getTestEvent() throws Exception {
		// when(employeeRepo.findAll()).thenReturn(Collections.emptyList());

		MvcResult mvcResult = mockMvc.perform( // using mock mvc builder we can handle the mockMvc
		MockMvcRequestBuilders.get("/api/event").accept(MediaType.APPLICATION_JSON)).andReturn();

		MockHttpServletResponse response = mvcResult.getResponse();
		assertEquals(200, response.getStatus()); // HttpStatus.OK.value()=200, HttpStatus.CREATED.value()=201
		System.out.println("Response:" + response.getContentAsString());

		// verify(employeeRepo).findAll();
		}

		

}
