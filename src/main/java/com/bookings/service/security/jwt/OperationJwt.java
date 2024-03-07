package com.bookings.service.security.jwt;


import com.bookings.service.dto.user.TokenDto;
import com.bookings.service.model.user.User;

public interface OperationJwt {
    TokenDto generateTokenDto(User user);
}
