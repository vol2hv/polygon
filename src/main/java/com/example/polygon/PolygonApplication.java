package com.example.polygon;

import com.example.polygon.beanexample.BeanExample;
import com.example.polygon.doman.Box;
import com.example.polygon.repository.BoxRepo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.annotation.PostConstruct;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

@SpringBootApplication
@Slf4j
public class PolygonApplication {
    @Autowired
    BoxRepo boxRepo;

    public static void main(String[] args) {
        SpringApplication.run(PolygonApplication.class, args);
        log.info("Что то да работает.");
    }
    @PostConstruct
    void createBoxes() {
//        boxRepo.save(new Box(null,"b1", "111" ));
//        boxRepo.save(new Box(null,"b2", "222" ));
//        boxRepo.save(new Box(null,"b3", "333" ));
        }

}
