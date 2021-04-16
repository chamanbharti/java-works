package com.landonhotel;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ComponentScan.Filter;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(excludeFilters={@Filter(org.springframework.stereotype.Controller.class)})
public class RootAppConfig {

	// @Bean configuration methods here
}
