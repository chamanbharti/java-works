package com.boraji.tutorial.spring.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

import com.boraji.tutorial.spring.interceptor.AdminInterceptor;
import com.boraji.tutorial.spring.interceptor.GuestInterceptor;

@Configuration
@EnableWebMvc
@ComponentScan(basePackages = { "com.boraji.tutorial.spring.controller" })
public class WebConfig extends WebMvcConfigurerAdapter {

   @Override
   public void addInterceptors(InterceptorRegistry registry) {
      // Register guest interceptor with single path pattern
      registry.addInterceptor(new GuestInterceptor()).addPathPatterns("/guest");

      // Register admin interceptor with multiple path patterns
      registry.addInterceptor(new AdminInterceptor())
              .addPathPatterns(new String[] { "/admin", "/admin/*" });
   }

   @Bean
   public InternalResourceViewResolver resolver() {
      InternalResourceViewResolver resolver = new InternalResourceViewResolver();
      resolver.setPrefix("/WEB-INF/views/");
      resolver.setSuffix(".jsp");
      return resolver;
   }

}
