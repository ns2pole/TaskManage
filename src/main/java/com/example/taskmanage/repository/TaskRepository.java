package com.example.taskmanage.repository;

import com.example.taskmanage.model.Task;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

public interface TaskRepository extends JpaRepository<Task, Integer> {
    public Optional<Task> findById(int id);
}