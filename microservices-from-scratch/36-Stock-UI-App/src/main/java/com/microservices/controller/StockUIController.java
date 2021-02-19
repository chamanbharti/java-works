package com.microservices.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.microservices.service.StockUIService;

@RestController
public class StockUIController {

	@Autowired
	private StockUIService service;
	@GetMapping("/")
	public String loadForm() {
		return "index";
	}
	@GetMapping("/getTotalCost")
	public String getTotalCost(HttpServletRequest req, Model model) {
		String companyName = req.getParameter("companyName");
		String quantity = req.getParameter("quantity");
		String response = service.getTotalStockPrice(companyName,Integer.parseInt(quantity));
		model.addAttribute("msg", response);
		return "index";
	}

}
