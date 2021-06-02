package com.example.polygon.repository;

import com.example.polygon.doman.Box;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface BoxRepo extends JpaRepository<Box, Long> {
//
    Box findByName(String name);

    @Query("SELECT b FROM Box b WHERE b.name = ?1")
    Box findByNameQuery(String name);
}
