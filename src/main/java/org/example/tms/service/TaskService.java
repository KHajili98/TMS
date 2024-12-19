package org.example.tms.service;

import jakarta.persistence.EntityNotFoundException;
import org.example.tms.dto.TaskDTO;
import org.example.tms.entity.Task;
import org.example.tms.repository.TaskRepository;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TaskService {
    private final TaskRepository taskRepository;

    @Autowired
    private ModelMapper taskMapper;

    public TaskService(TaskRepository taskRepository ) {
        this.taskRepository = taskRepository;
    }

    public List<Task> getAllTasks() {
        return taskRepository.findAll();
    }

    public Task getTaskById(Long id) {
        return taskRepository.findById(id).orElseThrow(() -> new EntityNotFoundException("Task not found"));
    }

    public TaskDTO createTask(TaskDTO taskDTO) {
        Task task = taskMapper.map(taskDTO, Task.class);
        Task savedTask = taskRepository.save(task);
        return taskMapper.map(savedTask, TaskDTO.class);
    }

    // Additional business logic methods
}
