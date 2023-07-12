package com.example.taskmanage.repository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.JdbcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.jdbc.core.JdbcTemplate;

import java.util.List;
import java.util.Map;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

@JdbcTest
public class TaskRepositoryTest {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @MockBean
    private TaskRepository taskRepository;

    @Test
    void testFindById() {


//        when(taskRepository.findAll()).thenReturn(Optional.of(testUser));
//
//        // メソッドをテスト
//        List<Map<String, Object>> actual = taskRepository.findAll();
//
//        // テストユーザーが正しく返されたことを確認
//        assertEquals(expected, actual);
    }
}
