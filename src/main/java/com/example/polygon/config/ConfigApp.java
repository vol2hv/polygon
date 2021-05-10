package com.example.polygon.config;

import com.example.polygon.beanexample.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ConfigApp {
    @Bean
    public MessageProvider provider() {
        return new SimpleMessageProvider();
    }
    @Bean
    BeanExample beanExample(){
        return new BeanExampleImpl();
    }
    @Bean
    public MessageRenderer render(@Autowired MessageProvider provider) {
        return new SimpleMessageRenderer(provider);
    }
}
