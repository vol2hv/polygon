package com.example.polygon.beanexample;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest()
class MessageRendererTest {

    @BeforeEach
    void setUp() {
    }

    @Test
    void render() {
        ApplicationContext  context = new ClassPathXmlApplicationContext("context.xml");
        MessageRenderer renderer = context.getBean("render", MessageRenderer.class);
        renderer.render();
    }
}