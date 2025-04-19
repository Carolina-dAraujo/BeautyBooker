package com.app.beautybooker.service;

import com.app.beautybooker.dto.user.UserRequestDTO;
import com.app.beautybooker.dto.user.UserResponseDTO;
import com.app.beautybooker.model.User;
import com.app.beautybooker.repository.UserRepository;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    private ModelMapper modelMapper;

    @Autowired
    private UserRepository userRepository;

    public UserResponseDTO createUser(UserRequestDTO userRequestDTO) {
        User user = modelMapper.map(userRequestDTO, User.class);

        user = userRepository.save(user);

        return modelMapper.map(user, UserResponseDTO.class);
    }

    public UserResponseDTO getUserById(int id) {
        User user = userRepository.findById(id).orElseThrow(() -> new RuntimeException("User not found"));
        return modelMapper.map(user, UserResponseDTO.class);
    }
}
