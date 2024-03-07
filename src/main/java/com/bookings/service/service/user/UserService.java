package com.bookings.service.service.user;


import com.bookings.service.dto.user.UserDto;
import com.bookings.service.dto.user.UserResponseDto;
import com.bookings.service.model.user.User;

import java.util.List;

public interface UserService {
    List<UserResponseDto> getAllUsers();
    UserResponseDto findUserById(String idUser);
    User findByEmail(String email);
    UserResponseDto createUser(UserDto userDto);
    UserResponseDto createUserAdmin(UserDto userDto);
    UserResponseDto saveUser(UserDto userDto);
    Boolean updateUser(String idUser, UserDto userDto);
    Boolean deleteUser(String idUser);

}
