package com.example.ToDoApp.DAL.models;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;

@Entity
@Builder
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "tasks")
public class Task {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "title", nullable = false)
    private String title;
    @Column(name = "description", nullable = false)
    private String description;
    private LocalDate dueDate;
    @Column(name = "status", nullable = false)
    private boolean completed;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;
}
