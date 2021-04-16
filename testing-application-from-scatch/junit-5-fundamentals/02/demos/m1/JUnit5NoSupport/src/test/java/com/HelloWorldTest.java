package com;
import org.junit.jupiter.api.Test;
import org.junit.platform.runner.JUnitPlatform;
import org.junit.platform.suite.api.SelectPackages;
import org.junit.runner.RunWith;

@RunWith(JUnitPlatform.class) 
@SelectPackages({"com"})
class HelloWorldTest {
    @Test
    void firstTest() {
        System.out.println("First test");
    }
}
