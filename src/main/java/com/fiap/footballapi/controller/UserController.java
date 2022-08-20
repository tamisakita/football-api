package com.fiap.footballapi.controller;

import com.fiap.footballapi.dto.AuthDto;
import com.fiap.footballapi.dto.CreateUserDto;
import com.fiap.footballapi.dto.TokenDto;
import com.fiap.footballapi.dto.UserDto;
import com.fiap.footballapi.service.UserService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("users")
public class UserController {
    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @PostMapping("login")
    public TokenDto login(@RequestBody AuthDto authDto) {
        return userService.login(authDto);
    }

    @PostMapping
    public UserDto create(@RequestBody CreateUserDto createUserDto) {
        return userService.create(createUserDto);
    }
}
