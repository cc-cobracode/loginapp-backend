package com.example.loginapp.services;

import com.example.loginapp.entities.UserEntity;
import com.example.loginapp.repositories.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class UserService {

    private final UserRepository userRepository;

    public List<UserEntity> getNames() {
        return userRepository.findAll();
    }
}
