package com.example.polygon.beanexample;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest()
class BeanExampleTest {
    @Autowired
    BeanExample beanExample;
    @Test
    void getMessage() {
        assertEquals("Сообщение от бина.", beanExample.getMessage());
    }
}