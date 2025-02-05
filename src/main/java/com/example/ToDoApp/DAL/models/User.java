package com.example.ToDoApp.DAL.models;


import jakarta.persistence.*;
import lombok.*;

import java.io.Serializable;
import java.util.List;
import java.util.Set;

@Entity
@Builder
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "users")
public class User {
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "login", unique = true, nullable = false)
    private String login;
    @Column(name = "password", nullable = false)
    private String password;

    @OneToMany(mappedBy = "users", cascade = CascadeType.ALL)
    private Set<Task> tasks;
}
