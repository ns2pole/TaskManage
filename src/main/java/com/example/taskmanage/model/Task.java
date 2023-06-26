package com.example.taskmanage.model;

import javax.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@Table(name = "tasks")
public class Task {
    @Id 
    private int id;
    private String name;
}