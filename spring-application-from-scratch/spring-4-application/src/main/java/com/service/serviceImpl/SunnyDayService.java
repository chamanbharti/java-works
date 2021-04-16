package com.service.serviceImpl;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import com.service.WeatherService;
@Service
@Profile({"sunny", "default"})
public class SunnyDayService implements WeatherService {

    @Override
    public String forecast() {
        return "Today is sunny day!";
    }

}