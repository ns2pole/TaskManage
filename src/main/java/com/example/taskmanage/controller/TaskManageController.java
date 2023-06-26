package com.example.taskmanage.controller;

import com.example.taskmanage.model.Task;
import com.example.taskmanage.repository.TaskRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@Controller
public class TaskManageController {
    @Autowired
    TaskRepository taskRepository;
    @GetMapping("/")
    public String index(Model model) {
        String str = "hello";
        Optional<Task> ot = taskRepository.findById(1);
        Task t = ot.get();
        model.addAttribute("message", t.getName());
        return "index";
    }
}