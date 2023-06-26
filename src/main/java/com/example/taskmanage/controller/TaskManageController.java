package com.example.taskmanage.controller;

import com.example.taskmanage.model.MxxModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class TaskManageController {

    @GetMapping(value = "/")
    public String ind() {
        return "index";
    }

}