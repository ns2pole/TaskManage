package com.example.taskmanage.controller;

import com.example.taskmanage.model.Division;
import com.example.taskmanage.repository.DivisionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class TaskManageController {
    @Autowired
    DivisionRepository divisionRepository;
    @GetMapping("/")
    public String index(Model model) {
        String str = "hello";

        Division d = divisionRepository.findById(2).get();
        model.addAttribute("message", d.getName());
        return "index";
    }
}