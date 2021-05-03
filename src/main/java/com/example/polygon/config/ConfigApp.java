package com.example.polygon.config;

import com.example.polygon.beanexample.BeanExample;
import com.example.polygon.beanexample.BeanExampleImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ConfigApp {
    @Bean
    BeanExample beanExample(){
        return new BeanExampleImpl();
    }
}
