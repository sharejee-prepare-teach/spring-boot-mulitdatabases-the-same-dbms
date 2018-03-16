package com.multidatabase.services.booking;

import com.multidatabase.domain.Booking;

import java.util.List;

/**
 * Created by : Ron Rith
 * Create Date: 03/16/2018.
 */
public interface BookingService {
    List findUserBookings(String emailId);
    List<Booking> getAllBooking();
}
