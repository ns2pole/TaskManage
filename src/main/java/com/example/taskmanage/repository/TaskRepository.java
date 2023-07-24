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
        return jdbcTemplate.queryForList(sql);
    }

    public Map<String, Object> findById(int id) {
        String sql = "SELECT * FROM TASKS WHERE id = ?";
        return jdbcTemplate.queryForMap(sql, id);
    }
    public void create(String name, String planminute) {
        String sql = "INSERT INTO TASKS (name, planminute) VALUES (?,?)";
        jdbcTemplate.update(sql, name, Integer.parseInt(planminute));
    }

    public void delete(int id) {
        String sql = "DELETE FROM TASKS WHERE id = ?";
        jdbcTemplate.update(sql, id);
    }

}
