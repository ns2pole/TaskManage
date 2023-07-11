package com.example.taskmanage.controller;

import com.example.taskmanage.repository.TaskRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.jdbc.core.JdbcTemplate;


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

    @PostMapping("/task/create")
    public String saveTask(@RequestParam String name, Model model) {
        taskRepository.create(name);
        return "redirect:/";
    }

    @PostMapping("/task/delete/{id}")
    public String deleteUser(@PathVariable int id) {
        taskRepository.delete(id);
        return "redirect:/";
    }
}