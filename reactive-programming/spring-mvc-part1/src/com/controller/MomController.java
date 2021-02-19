package com.controller;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
//@Component
public class MomController {

	@ResponseBody
	@RequestMapping("/sugar")
	public String giveSugar() {
		return "Ok.. <br>Here is your sugar <xml></xml>";
	}
}
