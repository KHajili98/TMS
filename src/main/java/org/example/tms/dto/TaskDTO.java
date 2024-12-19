package org.example.tms.dto;

import lombok.Data;

import java.time.LocalDateTime;
@Data
//@NoArgsConstructor
//@AllArgsConstructor
public class TaskDTO {
    private Long id;
    private String title;
    private String description;
    private LocalDateTime dueDate;

}
