package com.bookings.service.service.booking;


import com.bookings.service.dto.booking.BookingDto;
import com.bookings.service.dto.booking.BookingResponseDto;

import java.util.List;
import java.util.Optional;

public interface BookingService {
    List<BookingResponseDto> getAllBooking();
    Optional<BookingResponseDto> findBookingById(String idBooking);
    BookingResponseDto saveBooking(BookingDto bookingDto);

    BookingResponseDto saveBookingWithUser(BookingDto bookingDto);
    Boolean updateBooking(String idBooking, BookingDto bookingDto);
    Boolean deleteBooking(String idBooking);
}
