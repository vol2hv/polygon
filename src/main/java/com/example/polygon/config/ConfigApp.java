package com.example.polygon.config;

import com.example.polygon.beanexample.BeanExample;
import com.example.polygon.beanexample.BeanExampleImpl;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@ComponentScan("com.example.polygon")
@Configuration
public class ConfigApp {
    @Bean
    @Scope(value = ConfigurableBeanFactory.SCOPE_SINGLETON)
    BeanExample beanExample(){
        return new BeanExampleImpl();
    }
}
