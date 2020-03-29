package com.example.polygon.repository;

import com.example.polygon.doman.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepo extends JpaRepository<User, Long> {
    User findByUsername(String username);
    User findByEmail(String email);
    User findByActivationCode(String code);
}
