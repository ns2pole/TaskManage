package com.example.taskmanage.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

@Repository
public class TaskRepository {
    @Autowired
    private JdbcTemplate jdbcTemplate;

    public List<Map<String, Object>> findAll() {
        String sql = "SELECT * FROM TASKS";
        List<Map<String, Object>> result = jdbcTemplate.queryForList(sql);
        return result;
    }

    public void create(String name) {
        String sql = "INSERT INTO TASKS (name) VALUES (?)";
        jdbcTemplate.update(sql, name);
    }


}
