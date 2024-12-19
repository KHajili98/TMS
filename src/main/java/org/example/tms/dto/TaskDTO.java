package org.example.tms.dto;

import lombok.Data;
import org.example.tms.entity.TaskStatus;

import java.time.LocalDateTime;
@Data
//@NoArgsConstructor
//@AllArgsConstructor
public class TaskDTO {
    private String title;
    private TaskStatus status;
    private String description;
    private LocalDateTime dueDate;
}
