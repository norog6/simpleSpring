package com.solbeg.repository;

import com.solbeg.model.User;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

@Component
public class UserRepository {
    private final List<User> users = Arrays.asList(
            User.builder()
                    .id(1L)
                    .firstName("John")
                    .latName("Doe")
                    .email("@gmail.com")
                    .build()
            ,
            User.builder()
                    .id(2L)
                    .firstName("Jane")
                    .latName("Doe")
                    .email("@gmail.com")
                    .build(),
            User.builder()
                    .id(3L)
                    .firstName("Jack")
                    .latName("Doe")
                    .email("@gmail.com")
                    .build()
    );


    public Optional<User> findById(Long id) {
        return users.stream()
                .filter(user -> user.getId().equals(id))
                .findFirst();
    }


    public List<User> findAll() {
        return users;
    }


    public void save(User user) {
        users.add(user);
    }
}

