package com.app.beautybooker.service;

import com.app.beautybooker.model.Beauty;
import com.app.beautybooker.model.RoleEnum;
import com.app.beautybooker.model.User;
import com.app.beautybooker.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public User save(User user) {
        return userRepository.save(user);
    }

    public User findById(int id) {
        return userRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Usuário não encontrado"));
    }

    public List<User> findAll() {
        return userRepository.findAll();
    }

    public void deleteById(int id) {
        userRepository.deleteById(id);
    }

    public List<User> findByRole(RoleEnum role) {
        return userRepository.findByRole(role);
    }
}
