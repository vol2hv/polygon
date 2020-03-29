package com.example.polygon;

import com.example.polygon.doman.Box;
import com.example.polygon.doman.Role;
import com.example.polygon.doman.User;
import com.example.polygon.repository.BoxRepo;
import com.example.polygon.repository.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.crypto.password.PasswordEncoder;

import javax.annotation.PostConstruct;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

@SpringBootApplication
public class PolygonApplication {
    @Autowired
    BoxRepo boxRepo;
    @Autowired
    UserRepo userRepo;
    @Autowired
    private PasswordEncoder passwordEncoder;

    public static void main(String[] args) {
        SpringApplication.run(PolygonApplication.class, args);
    }
    @PostConstruct
    void createUsersAndRoles() {
        User user = userRepo.findByUsername("admin");
        if (user == null) {
            Set<Role> roles = new HashSet<> ( Arrays.asList(Role.values()) );
            user = new User(null,"admin",
                    passwordEncoder.encode("111"),true,
                    "admin@ya.ru","", roles);
            userRepo.save(user);
        }
    }

    @PostConstruct
    void createBoxes() {
//        boxRepo.save(new Box(null,"b1", "111" ));
//        boxRepo.save(new Box(null,"b2", "222" ));
//        boxRepo.save(new Box(null,"b3", "333" ));
        }

}
