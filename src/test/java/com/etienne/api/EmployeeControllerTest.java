package com.etienne.api;

import static org.hamcrest.CoreMatchers.is;
import static org.mockito.Mockito.mock;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.web.servlet.MockMvc;

import com.etienne.api.controller.EmployeeController;
import com.etienne.api.services.EmployeeService;

@SpringBootTest
@WebMvcTest(controllers = EmployeeController.class)
public class EmployeeControllerTest {

	//test unitaire
	 @Autowired
	    private MockMvc mockMvc;
	 
	 @MockBean
	    EmployeeService service;
	
	 @Test
	    public void testGetEmployees() throws Exception {
	        mockMvc.perform(get("/employees"))
	            .andExpect(status().isOk());
	    }
	 
	 //test d'intégration
	 
	 @Test
	 public void TestGetEmployeesInteg() throws Exception {
		 mockMvc.perform(get("/employees")).andExpect(status().isOk()).andExpect(jsonPath("$[0].firstname",is("Laurent")));
	 }
	 
	
}
