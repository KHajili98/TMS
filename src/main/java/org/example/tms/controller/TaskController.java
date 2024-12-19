package org.example.tms.controller;
import org.example.tms.dto.TaskDTO;
import org.example.tms.entity.Task;
import org.example.tms.service.TaskService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/api/tasks")
public class TaskController {
    private final TaskService taskService;

    public TaskController(TaskService taskService) {
        this.taskService = taskService;
    }

    @GetMapping
    public List<Task> getAllTasks() {
        return taskService.getAllTasks();
    }

    @GetMapping("/{id}")
    public Task getTaskById(@PathVariable Long id) {
        return taskService.getTaskById(id);
    }


//    @PostMapping
//    public ResponseEntity<TaskDTO> createTask(@RequestBody TaskDTO taskDTO) {
//        TaskDTO createdTask = taskService.createTask(taskDTO);
//        return ResponseEntity.ok(createdTask);
//    }

    // Additional CRUD endpoints
}
