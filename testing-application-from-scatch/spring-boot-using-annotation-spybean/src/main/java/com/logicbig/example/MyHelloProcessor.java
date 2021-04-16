package com.logicbig.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class MyHelloProcessor {
    @Autowired
    private HelloService helloService;

    public String getMessage() {
        return helloService.getMessage();
    }

    public String getFormattedMessage() {
        return helloService.getFormattedMessage();
    }
}