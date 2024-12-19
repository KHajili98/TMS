package org.example.tms.controller;

import org.example.tms.dto.UserDTO;
import org.example.tms.entity.User;
import org.example.tms.service.UserService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/users")
public class UserController {
    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping
    public List<User> getAllUsers() {
        return userService.getAllUsers();
    }

    @GetMapping("/{id}")
    public User getUserById(@PathVariable Long id) {
        return userService.getUserById(id);
    }

    @PostMapping
    public ResponseEntity<UserDTO> createUser(@RequestBody UserDTO userDTO) {
        System.out.println(userDTO.toString());
        return new ResponseEntity<>( userService.createUser(userDTO),HttpStatus.CREATED);
    }

    // Additional CRUD endpoints
}
