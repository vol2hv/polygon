package com.example.polygon.repository;

import com.example.polygon.doman.Box;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BoxRepo extends JpaRepository<Box, Long> {
    Box findByName(String name);
}
