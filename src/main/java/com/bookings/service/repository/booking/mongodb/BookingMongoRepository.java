package com.bookings.service.repository.booking.mongodb;


import com.bookings.service.model.booking.Booking;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface BookingMongoRepository extends MongoRepository<Booking, String> {
}
