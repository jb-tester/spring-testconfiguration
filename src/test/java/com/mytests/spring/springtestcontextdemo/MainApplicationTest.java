package com.mytests.spring.springtestcontextdemo;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.TestConfiguration;
import org.springframework.context.annotation.Bean;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class MainApplicationTest {

//  2 autowiring candidates are shown - for src bean and for bean from the different test inner configuration
// https://youtrack.jetbrains.com/issue/IDEA-166991/Spring-Boot-Testing-the-beans-defined-in-the-nested-TestConfiguration-classes-should-not-be-visible-for-other-test-classes
    @Autowired
    private SomeBean someBean;

    @Test
    void testBeanFromTestConfiguration() {
        assertEquals(someBean.getId(), "bean from src");;
    }


}
