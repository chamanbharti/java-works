package com.landonhotel;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.InitBinder;

import com.landonhotel.eventsapp.controller.QuoteRequestController;
import com.landonhotel.eventsapp.controller.QuoteRequestManagementController;


public class QuoteRequestManagementAdvice {
	
	/*
	@InitBinder
	public void initBinder(WebDataBinder binder) {
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
		dateFormat.setLenient(false);
		
		binder.registerCustomEditor(Date.class, 
				new CustomDateEditor(dateFormat, false));;
		
	}
	*/
}
