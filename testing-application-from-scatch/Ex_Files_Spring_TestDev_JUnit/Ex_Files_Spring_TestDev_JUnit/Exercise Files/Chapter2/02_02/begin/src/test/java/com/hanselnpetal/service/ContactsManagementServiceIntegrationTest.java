package com.hanselnpetal.service;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.mockito.Matchers.any;
import static org.mockito.Mockito.when;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
import org.springframework.test.context.junit4.SpringRunner;

import com.hanselnpetal.data.repos.CustomerContactRepository;
import com.hanselnpetal.domain.CustomerContact;

@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = WebEnvironment.NONE)
public class ContactsManagementServiceIntegrationTest {
	
	@Mock
	private CustomerContactRepository customerContactRepository;
	
	//@Autowired
	@InjectMocks
	private ContactsManagementService contactsManagementService;
	
	@Before
	public void setup() {
		MockitoAnnotations.initMocks(this);
	}
	
	@Test
	public void testAddContactHappyPath() {
		
		// Create a contact
		CustomerContact aMockContact = new CustomerContact();
		aMockContact.setFirstName("Chaman");
		aMockContact.setLastName("Bharti");
		
		when(customerContactRepository.save(any(CustomerContact.class))).thenReturn(aMockContact);
		
		//Save the contact
		CustomerContact newContact	= contactsManagementService.add(null);
		
		// Verify the save
		assertNotNull(newContact);
		assertNotNull(newContact.getId());
		assertEquals("Chaman", newContact.getFirstName());
		
	}
}
