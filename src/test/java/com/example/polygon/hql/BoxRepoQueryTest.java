package com.example.polygon.hql;

import com.example.polygon.doman.Box;
import com.example.polygon.repository.BoxRepo;
import com.example.polygon.repository.BoxRepoQuery;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;
@SpringBootTest
//@ExtendWith(SpringExtension.class)
@Slf4j
class BoxRepoQueryTest {
    private static boolean dbInit = false;

    @Autowired
    BoxRepo boxRepo;
    @Autowired
    BoxRepoQuery query;
    Box box;

    @BeforeEach
    void setUp() {
        if (!dbInit){
            box = boxRepo.save(new Box(null,"b1", "111" ));
            box = boxRepo.save(new Box(null,"b2", "222" ));
            box = boxRepo.save(new Box(null,"b3", "333" ));
            box = boxRepo.save(new Box(null,"b4", "444" ));
            dbInit = true;
        }
    }
    @Test
    void getAll() {
        List<Box> boxes = query.getAll();
        boxes.forEach(System.out::println);
    }
    @Test
    void findByNameJpql(){
        Box box = query.findByNameJpql("b2");
        System.out.println(box.toString());
    }
    @Test
    void findByNameHql(){
        Box box = query.findByNameHql("b1");
        System.out.println(box.toString());
    }
    @Test
    void findByNameQuery(){
        Box box = boxRepo.findByNameQuery("b3");
        System.out.println(box.toString());
    }
    @Test
    void findByName(){
        Box box = boxRepo.findByName("b4");
        System.out.println(box.toString());
    }
}