package com.fiap.footballapi.service;

import com.fiap.footballapi.dto.AuthDto;
import com.fiap.footballapi.dto.CreateUserDto;
import com.fiap.footballapi.dto.TokenDto;
import com.fiap.footballapi.dto.UserDto;

public interface UserService {
    TokenDto login(AuthDto authDto);

    UserDto create(CreateUserDto createUserDto);
}
