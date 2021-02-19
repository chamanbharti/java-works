package com.landonhotel.eventsapp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.landonhotel.eventsapp.domain.QuoteRequest;

@Controller
public class QuoteRequestManagementController {
    
	@GetMapping(path = "/quoteRequests")
    public String listRequests() {
        
        
    		return "quoteRequestList";
    }
	
	public String viewQuoteRequest() {
    	
    	
    		return "quoteRequestDetail";
    }
    
    public String updateQuoteRequest() {
        
        
    		return "quoteRequestDetail";
    }
}
