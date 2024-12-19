package org.example.tms.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
@Data
@AllArgsConstructor
public class TaskDTO {
    private String title;
    private String description;
    private LocalDateTime dueDate;

}
