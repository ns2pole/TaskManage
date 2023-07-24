package com.example.taskmanage.controller;

import com.example.taskmanage.repository.TaskRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.jdbc.core.JdbcTemplate;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.Map;


@Controller
public class TaskManageController {
    @Autowired
    private JdbcTemplate jdbcTemplate;
    @Autowired
    private TaskRepository taskRepository;

    @GetMapping("/")
    public String index(Model model) {

        model.addAttribute("tasks", taskRepository.findAll());
        return "/task/index";
    }

    @GetMapping("/task/create")
    public String create(Model model) {
        return "/task/create";
    }

    @GetMapping("/task/edit/{id}")
    public String editTask(@PathVariable int id, Model model) {
        Map<String, Object> task = taskRepository.findById(id);
        model.addAttribute("name", task.get("name"));
        model.addAttribute("planminute", task.get("planminute"));
        model.addAttribute("id", id);
        return "/task/edit";
    }

    @PostMapping("/task/create")
    public String saveTask(@RequestParam String name, @RequestParam String planminute, Model model) {
        taskRepository.create(name, planminute);
        return "redirect:/";
    }



    @PostMapping("/task/edit/{id}")
    public String updateTask(@PathVariable int id, @RequestParam String name, @RequestParam String planminute) {
        String sql = "UPDATE TASKS SET name = ?, planminute = ? WHERE id = ?";
        jdbcTemplate.update(sql, name, Integer.valueOf(planminute), id);
        return "redirect:/";
    }

    @PostMapping("/task/delete/{id}")
    public String deleteTask(@PathVariable int id) {
        taskRepository.delete(id);
        return "redirect:/";
    }
}