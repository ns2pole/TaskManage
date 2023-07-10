package com.example.taskmanage.controller;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.view;

@SpringBootTest
@AutoConfigureMockMvc
public class TaskControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @Test
    public void testListUsers() throws Exception {
        mockMvc.perform(get("/"))
                .andExpect(status().isOk())
                .andExpect(view().name("/task/index"));
    }

    @Test
    public void testCreateTask() throws Exception {
        mockMvc.perform(get("/task/create"))
                .andExpect(status().isOk())
                .andExpect(view().name("/task/create"));
    }


//    @Test
//    public void testEditTask() throws Exception {
//        mockMvc.perform(get("/task/edit/1"))
//                .andExpect(status().isOk())
//                .andExpect(view().name("edit"));
//    }
}