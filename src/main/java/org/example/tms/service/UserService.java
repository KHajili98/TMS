package org.example.tms.service;

import jakarta.persistence.EntityNotFoundException;
import lombok.RequiredArgsConstructor;
import org.example.tms.dto.UserDTO;
import org.example.tms.entity.User;
import org.example.tms.repository.UserRepository;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
//@RequiredArgsConstructor
public class UserService {
    private final UserRepository userRepository;
    private final ModelMapper userMapper;

    public UserService(UserRepository userRepository, ModelMapper userMapper) {
        this.userRepository = userRepository;
        this.userMapper = userMapper;
    }



    public List<User> getAllUsers() {
        return userRepository.findAll();
    }

    public User getUserById(Long id) {
        return userRepository.findById(id).orElseThrow(() -> new EntityNotFoundException("User not found"));
    }

    public UserDTO createUser(UserDTO userDTO) {


        User user = userMapper.map(userDTO, User.class);
        System.out.println(user);
        User savedUser = userRepository.save(user);
        return userMapper.map(savedUser, UserDTO.class);
    }

}
