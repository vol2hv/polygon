package com.example.polygon.repository;

import com.example.polygon.doman.Box;

import java.util.List;

public interface BoxRepoQuery {
    List<Box> getAll();
    Box findByNameJpql(String name);
    Box findByNameHql(String name);
}
