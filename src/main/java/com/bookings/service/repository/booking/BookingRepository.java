package com.bookings.service.repository.booking;


import com.bookings.service.model.booking.Booking;

import java.util.List;

public interface BookingRepository {
    List<Booking> getAllBookings();
    Booking findBookingById(String idBooking);
    Booking saveBooking(Booking booking);
    Boolean updateBooking(String idBooking, Booking booking);
    Boolean deleteBooking(String idBooking);
}
