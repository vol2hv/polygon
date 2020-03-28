package com.example.polygon.controller;

import com.example.polygon.doman.Box;
import com.example.polygon.repository.BoxRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
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

        boxes.forEach(b -> sb.append(b.toString() + "<br>"));
        if (boxes.size() > 0) {
            return sb.toString();
        } else {
            return "Таблица пуста.";
        }
    }
//
//    @GetMapping("/")
//    public String root(Model model) {
//        model.addAttribute("baseAPI", hostname.split(":")[0] + basePath);
//        return "/index";
//    }
//
//    // для демонстрации секьюрити.
//    @GetMapping("/admin")
//    public String admin() {
//        return "/admin";
//    }
//
//    @GetMapping("/client")
//    public String user() {
//        return "/client";
//    }
//
//    @GetMapping("/about")
////    @PreAuthorize("hasAuthority('ADMIN')")
//    public String about() {
//        return "/about";
//    }
//    // отображение таблиц системы
//    @GetMapping(Moika2Application.PATH_TABLES_RENDERING)
//    public String table(Model model) {
//        model.addAttribute("base", Moika2Application.PATH_TABLES_RENDERING);
//        return "/table";
//    }
//    @GetMapping("/403")
//    public String error403() {
//        return "/error/403";
//    }

}
