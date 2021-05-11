package com.example.polygon.controller;

import com.example.polygon.doman.Box;
import com.example.polygon.repository.BoxRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
* главный контоллер
*/



@Controller
public class MainController {
    @Autowired
    private BoxRepo boxRepo;

    @ResponseBody
    @GetMapping("/")
    public String index() {
        List<Box> boxes = boxRepo.findAll();

        StringBuilder sb = new StringBuilder();
        sb.append("Ура заработало! <br>");
        boxes.forEach(b -> sb.append(b.toString() + "<br>"));

        if (boxes.size() > 0) {
            return sb.toString();
        } else {
            return "Таблица пуста.";
        }
    }
}
