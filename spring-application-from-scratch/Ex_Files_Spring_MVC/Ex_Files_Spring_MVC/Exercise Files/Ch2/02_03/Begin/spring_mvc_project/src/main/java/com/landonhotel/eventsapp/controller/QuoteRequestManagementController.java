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
	
	@GetMapping(path = "/quoteRequests", params="!eventType")
    public String listWeddingRequests() {
        
        
    		return "quoteRequestList";
    }
	
	@GetMapping("/quoteRequest/{quotedId}")
	public String viewQuoteRequest(@PathVariable int quoteId) {
    		
		// refer to quoteId in my implementation
		
    		return "quoteRequestDetail";
    }
    
	@PostMapping("/quoteDetail")
	public String updateQuoteRequest(@ModelAttribute QuoteRequest formBean) {
        
		// implement a save of all of the form bean information
        
    		return "quoteRequestDetail";
    }
}
