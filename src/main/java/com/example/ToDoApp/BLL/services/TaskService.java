package com.example.ToDoApp.BLL.services;

import com.example.ToDoApp.DAL.models.Task;
import com.example.ToDoApp.DAL.repositories.TaskRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TaskService {

    @Autowired
    private TaskRepository taskRepository;

    public List<Task> getAllTasks(int userId) {
        return taskRepository.findByUserId(userId);
    }

    public Task createNewTask(Task task) {
        return taskRepository.save(task);
    }

    public Task updateTask(Task task) {
        return taskRepository.save(task);
    }
    public void deleteTask(Task task) {
        taskRepository.delete(task);
    }
}
