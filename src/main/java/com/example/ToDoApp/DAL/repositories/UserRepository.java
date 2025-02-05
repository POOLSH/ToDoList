package com.example.ToDoApp.DAL.repositories;

import com.example.ToDoApp.DAL.models.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserRepository extends JpaRepository<User, Integer> {

    public User findByLogin(String login);
}
