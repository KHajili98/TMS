package org.example.tms.mapper;

import org.example.tms.dto.TaskDTO;
import org.example.tms.entity.Task;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface TaskMapper {

    TaskDTO toDTO(Task task);

    Task toEntity(TaskDTO taskDTO);
}
