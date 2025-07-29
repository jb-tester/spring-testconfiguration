package com.mytests.spring.springtestcontextdemo;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.TestConfiguration;
import org.springframework.context.annotation.Bean;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class TestWithInnerTestConfiguration {


    @Autowired
    private SomeBean someBeanFromTests;

    @Test
    void testBeanFromTestConfiguration() {
        assertEquals(someBeanFromTests.getId(), "bean from test");;
    }

    @TestConfiguration
    public static class TestConfig{
       // 3 candidates are shown as possible injection points:
        // 1. bean from src - incorrect
        // 2. bean from the current test - correct
        // 3. bean from the different test - incorrect
        @Bean
        SomeBean someBeanFromTests() {
            return new SomeBean("bean from test");
        }
    }
}
