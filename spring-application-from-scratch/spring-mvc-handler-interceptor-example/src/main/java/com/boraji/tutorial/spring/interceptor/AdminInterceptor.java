package com.boraji.tutorial.spring.interceptor;

import java.time.LocalTime;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

public class AdminInterceptor extends HandlerInterceptorAdapter {

   @Override
   public void postHandle(HttpServletRequest req, HttpServletResponse res,
         Object handler, ModelAndView model)
         throws Exception {

      System.out.println("Called after handler method request completion,"
            + " before rendering the view");

      LocalTime time = LocalTime.now();
      int hrs = time.getHour();
      if (hrs >= 0 && hrs <= 12) {
         model.addObject("greeting", "Good morning!");
      } else if (hrs > 12 && hrs <= 17) {
         model.addObject("greeting", "Good afternoon!");
      } else {
         model.addObject("greeting", "Good evening!");
      }
   }
}
