package com.example.taskmanage.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class TaskManageController {

    @GetMapping("/")
    public String index(Model model) {
        String str = "hello";
        model.addAttribute("message", str);
        return "index";
    }
}