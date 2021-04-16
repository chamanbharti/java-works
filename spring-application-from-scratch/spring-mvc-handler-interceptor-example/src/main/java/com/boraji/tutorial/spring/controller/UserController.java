package com.boraji.tutorial.spring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class UserController {

   @RequestMapping("/")
   public String index() {
      return "index";
   }

   @RequestMapping("/guest")
   public String guestHandler(@RequestAttribute("fname")String fname,Model model) {
      model.addAttribute("mname", "Smith");
      return "guest";
   }

   @RequestMapping("/admin")
   public String adminHandler(Model model) {
      model.addAttribute("name", "Mike");
      return "admin";
   }
}
