package com.bookings.service.dto.booking;

import com.bookings.service.model.user.User;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
import java.util.List;
@Data
@NoArgsConstructor
@AllArgsConstructor
public class BookingResponseDto {
    private String idBooking;
    private String nameHotel;
    private int roomNumber;
    private LocalDateTime startBooking;
    private LocalDateTime endBooking;
    private List<User> userData;

}
