package org.example.tms.mapper;

import org.example.tms.dto.TaskDTO;
import org.example.tms.dto.UserDTO;
import org.example.tms.entity.Task;
import org.example.tms.entity.User;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface TaskMapper {
    TaskMapper INSTANCE = Mappers.getMapper(TaskMapper.class);

    TaskDTO toDTO(Task task);
    Task toEntity(TaskDTO taskDTO);
}
