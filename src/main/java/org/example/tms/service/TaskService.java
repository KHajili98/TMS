package org.example.tms.service;

import jakarta.persistence.EntityNotFoundException;
import org.example.tms.dto.TaskDTO;
import org.example.tms.dto.UserDTO;
import org.example.tms.entity.Task;
import org.example.tms.entity.User;
import org.example.tms.exception.network.CustomEntityNotFoundException;
import org.example.tms.mapper.TaskMapper;
import org.example.tms.repository.TaskRepository;
import org.example.tms.repository.UserRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TaskService {
    private final TaskRepository taskRepository;
    private final TaskMapper taskMapper;

    public TaskService(TaskRepository taskRepository, TaskMapper taskMapper) {
        this.taskRepository = taskRepository;
        this.taskMapper = taskMapper;
    }



    public List<Task> getAllTasks() {
        return taskRepository.findAll();
    }

    public Task getTaskById(Long id) {
        return taskRepository.findById(id).orElseThrow(() ->  new CustomEntityNotFoundException(Task.class, id));
    }
    public TaskDTO createTask (TaskDTO taskDTO) {
        Task task = taskMapper.toEntity(taskDTO);
        Task savedTask = taskRepository.save(task);
        return taskMapper.toDTO(savedTask);
    }
    // Additional business logic methods
}
