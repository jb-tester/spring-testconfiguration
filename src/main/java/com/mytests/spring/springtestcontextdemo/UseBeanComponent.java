package com.mytests.spring.springtestcontextdemo;

import org.springframework.stereotype.Component;

/**
 * *
 * <p>Created by irina on 7/29/2025.</p>
 * *
 */
@Component
class UseBeanComponent {

    private final SomeBean someBean;

    UseBeanComponent(SomeBean someBeanFromSrc) {
        this.someBean = someBeanFromSrc;
    }

    @Override
    public String toString() {
        return "UseBeanComponent{" +
               "someBean=" + someBean.getId() +
               '}';
    }
}
