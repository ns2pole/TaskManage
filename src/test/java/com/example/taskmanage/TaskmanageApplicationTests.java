package com.example.taskmanage;

import com.example.taskmanage.repository.TaskRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
@ActiveProfiles("test")
class TaskmanageApplicationTests {

	@Autowired
	TaskRepository taskRepository;

	@Test
	void findAll() {
		assertEquals(3, taskRepository.findAll().size());
	}

}
