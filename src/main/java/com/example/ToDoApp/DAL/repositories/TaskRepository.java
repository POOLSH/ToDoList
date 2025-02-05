package com.example.ToDoApp.DAL.repositories;

import com.example.ToDoApp.DAL.models.Task;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface TaskRepository extends JpaRepository<Task, Integer> {

    public List<Task> findByUserId(int id);

    int id(int id);
}
