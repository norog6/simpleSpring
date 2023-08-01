package com.solbeg.service;

import com.solbeg.model.User;
import com.solbeg.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class UserService {
    @Autowired
    private UserRepository userRepository;


    public void save(User user) {
        userRepository.save(user);
    }

    public User findById(Long id) {
        return userRepository
                .findById(id)
                .orElseThrow(() -> new RuntimeException("User not found"));
    }

    public List<User> findAll() {
        return userRepository.findAll();
    }
}
