package com.aditya.project.service;

import com.aditya.project.dto.UserDto;
import com.aditya.project.mapper.UserMapper;
import com.aditya.project.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserService {

    private final UserRepository userRepository;

    private final UserMapper userMapper;

    public UserDto save(UserDto userDto) {
        return userMapper.map(userRepository.save(userMapper.map(userDto)));
    }
}
