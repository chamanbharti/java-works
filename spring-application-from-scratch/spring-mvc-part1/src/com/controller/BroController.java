package com.controller;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
//@Component 
/*when you will use it here you will get 
Jan 27, 2021 6:45:45 PM org.springframework.web.servlet.DispatcherServlet noHandlerFound
WARNING: No mapping for GET /spring-mvc-part1/home.com/cricketbat
on runtime
*/
@Controller
public class BroController {

	@ResponseBody
	@RequestMapping("/cricketbat")
	public String giveSugar() {
		return "Hey mam, This is your cricket bats";
	}
}
