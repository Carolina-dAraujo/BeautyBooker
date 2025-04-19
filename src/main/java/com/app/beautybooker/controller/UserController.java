package com.app.beautybooker.controller;

import com.app.beautybooker.dto.user.UserRequestDTO;
import com.app.beautybooker.dto.user.UserResponseDTO;
import com.app.beautybooker.service.UserService;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/beautybooker/user")
@Tag(name = "Users", description = "Users' operations")
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping
    public UserResponseDTO createUser(@RequestBody UserRequestDTO userRequestDTO) {
        return userService.createUser(userRequestDTO);
    }

    @GetMapping("/{id}")
    public UserResponseDTO getUserById(@PathVariable int id) {
        return userService.getUserById(id);
    }
}
