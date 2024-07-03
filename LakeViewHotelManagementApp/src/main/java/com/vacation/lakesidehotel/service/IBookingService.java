package com.vacation.lakesidehotel.service;

import com.vacation.lakesidehotel.model.BookedRoom;

import java.util.List;

/**
 * @author Gaurav Yadav
 */

public interface IBookingService {
    void cancelBooking(Long bookingId);

    List<BookedRoom> getAllBookingsByRoomId(Long roomId);

    String saveBooking(Long roomId, BookedRoom bookingRequest);

    BookedRoom findByBookingConfirmationCode(String confirmationCode);

    List<BookedRoom> getAllBookings();

    List<BookedRoom> getBookingsByUserEmail(String email);
}
