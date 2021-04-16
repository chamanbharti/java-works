package com.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import com.interceptor.DemoInterceptorUsingInterface;
import com.interceptor.RequestHeaderInterceptor;
@Configuration
public class StudentConfig implements WebMvcConfigurer{

	@Autowired
	private RequestHeaderInterceptor requestHeaderInterceptor;
	
	@Bean
    DemoInterceptorUsingInterface demoInterceptor() {
         return new DemoInterceptorUsingInterface();
    }
	@Override
	public void addInterceptors(InterceptorRegistry registry) {
		//registry.addInterceptor(requestHeaderInterceptor);
		registry.addInterceptor(demoInterceptor());
	}
}
