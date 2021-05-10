package com.example.polygon.beanexample;

import com.example.polygon.config.ConfigApp;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest()
class MessageRendererTest {

    @BeforeEach
    void setUp() {
    }

    @Test
    void render() {
        ApplicationContext  context = new AnnotationConfigApplicationContext(ConfigApp.class);
        MessageRenderer renderer = context.getBean("render", MessageRenderer.class);
        renderer.render();
    }
}