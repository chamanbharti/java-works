package com;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;

import com.service.WeatherService;

@SpringBootTest
@ActiveProfiles("sunny")
class Spring4ApplicationTests {

	@Autowired
    WeatherService weatherService;
	
	@Test
	void contextLoads() {
		System.out.println("default test");
	}
	
	 @Test
	 public void testRainingProfile() {
        String output = weatherService.forecast();
        assertThat(output).contains("Today is sunny day!");
	 }

}
