package com.aditya.project.mapper;

import com.aditya.project.dto.UserDto;
import com.aditya.project.entity.User;
import org.springframework.stereotype.Service;

@Service
public class UserMapper {

    public User map(UserDto userDto) {
        User user = new User();
        user.setId(userDto.getId());
        user.setName(userDto.getName());
        user.setDob(userDto.getDob());
        return user;
    }

    public UserDto map(User user) {
        UserDto userDto = new UserDto();
        userDto.setId(user.getId());
        userDto.setName(user.getName());
        userDto.setDob(user.getDob());
        return userDto;
    }
}
