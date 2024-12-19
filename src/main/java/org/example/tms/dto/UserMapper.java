package org.example.tms.dto;

import org.example.tms.entity.User;

public class UserMapper {

    public static User mapToUser(UserDTO userDTO) {

        return new User(
                userDTO.getId(),
                userDTO.getName(),
                userDTO.getEmail()
        );
    }


    public static UserDTO mapToUserDto(User user) {
        return new UserDTO(
                user.getId(),
                user.getName(),
                user.getEmail()
        );
    }
}
