package com.example.polygon.beanexample;

import org.springframework.stereotype.Component;

@Component
public class SimpleMessageProvider implements MessageProvider {

    @Override
    public String getMessage() {
        return "Привет семье!";
    }

}
