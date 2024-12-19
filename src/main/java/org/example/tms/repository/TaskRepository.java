package org.example.tms.repository;

import org.example.tms.entity.Task;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TaskRepository extends JpaRepository<Task, Long> {
    // Additional query methods if needed
}
