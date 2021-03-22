package com.example.loginapp.controllers;

import com.example.loginapp.entities.UserEntity;
import com.example.loginapp.services.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/v1")
@RequiredArgsConstructor
public class UserController {

    private final UserService userService;

    @GetMapping(value = "/getUsers")
    public List<UserEntity> getUsers() {
        return userService.getNames();
    }
}
