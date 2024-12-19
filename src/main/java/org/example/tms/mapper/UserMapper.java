package org.example.tms.mapper;

import org.example.tms.dto.UserDTO;
import org.example.tms.entity.User;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface UserMapper {

    UserDTO toDTO(User user);

    User toEntity(UserDTO userDTO);
}
