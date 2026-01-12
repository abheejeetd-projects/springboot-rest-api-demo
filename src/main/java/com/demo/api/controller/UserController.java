package com.demo.api.controller;

import com.demo.api.dto.UserRequest;
import com.demo.api.dto.UserResponse;
import com.demo.api.model.User;
import com.demo.api.service.UserService;
import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/users")
public class UserController {

    private final UserService service;

    public UserController(UserService service) {
        this.service = service;
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public UserResponse create(@Valid @RequestBody UserRequest request) {
        User user = service.create(request);
        return new UserResponse(user.getId(), user.getName(), user.getEmail());
    }

    @GetMapping("/{id}")
    public UserResponse get(@PathVariable Long id) {
        User user = service.getById(id);
        return new UserResponse(user.getId(), user.getName(), user.getEmail());
    }
}
