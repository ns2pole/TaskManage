package com.example.taskmanage.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.jdbc.core.JdbcTemplate;

import java.util.Map;

@Controller
public class TaskManageController {
    @Autowired
    private JdbcTemplate jdbcTemplate;

    @GetMapping("/")
    public String index(Model model) {
        String sql = "SELECT * FROM tasks WHERE id = 2";
        Map<String, Object> result = jdbcTemplate.queryForMap(sql);
        model.addAttribute("taskName", result.get("name"));
        return "index";
    }
}