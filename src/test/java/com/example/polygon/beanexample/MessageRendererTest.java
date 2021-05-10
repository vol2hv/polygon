package com.example.polygon.beanexample;

import com.example.polygon.config.ConfigApp;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootTest()
class MessageRendererTest {
    @Autowired
    private MessageRenderer render;
    @BeforeEach
    void setUp() {
    }

    @Test
    void render() {
        // просто
        render.render();
    }
    @Test
    void info () {
        //Более многословно
        ApplicationContext context = new AnnotationConfigApplicationContext(ConfigApp.class);
        MessageRenderer renderer = context.getBean("simpleMessageRenderer", MessageRenderer.class);
        renderer.render();
    }
}