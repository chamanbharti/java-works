package com.landonhotel.eventsapp.controller;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.MockitoAnnotations;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

import com.landonhotel.eventsapp.domain.QuoteRequest;


@RunWith(SpringRunner.class)
@WebMvcTest(QuoteRequestManagementController.class)
public class QuoteRequestManagementControllerUnitTest {

	@Autowired
	private MockMvc mockMvc;
	
	@InjectMocks
	private QuoteRequestManagementController quoteRequestMgmtController;
	
	@Before
	public void setUp() {
		MockitoAnnotations.initMocks(this);	
	}
	
	@Test
	public void testGetWeddingQuoteRequests() throws Exception {
		
		// simulate getting a new form for the user to fill in (GET Request)
		mockMvc
			.perform(get("/quoteRequests").param("eventType", "wedding"))
			.andExpect(status().is(200))
			.andReturn();
	}
	
	@Test
	public void testGetQuoteRequestDetail() throws Exception {
		
		// simulate getting a new form for the user to fill in (GET Request)
		mockMvc
			.perform(get("/quoteRequest/8"))
			.andExpect(status().is(200))
			.andReturn();
	}
	
	
}
