package com.demo.api.service;

import com.demo.api.dto.UserRequest;
import com.demo.api.exception.ResourceNotFoundException;
import com.demo.api.model.User;
import com.demo.api.repository.UserRepository;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    private final UserRepository repository;

    public UserService(UserRepository repository) {
        this.repository = repository;
    }

    public User create(UserRequest request) {
        User user = new User(request.getName(), request.getEmail());
        return repository.save(user);
    }

    public User getById(Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("User not found with id " + id));
    }
}
