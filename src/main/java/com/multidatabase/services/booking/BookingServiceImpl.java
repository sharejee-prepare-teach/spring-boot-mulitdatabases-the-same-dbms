package com.multidatabase.services.booking;

import com.multidatabase.domain.Booking;
import com.multidatabase.domain.UserDetails;
import com.multidatabase.repositories.BookingDao;
import com.multidatabase.repositories.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by : Ron Rith
 * Create Date: 03/16/2018.
 */
@Service
@Transactional
public class BookingServiceImpl implements BookingService {
    @Autowired
    private BookingDao bookingDao;

    @Override
    public List findUserBookings(String emailId) {
        return null;
    }

    @Override
    public List<Booking> getAllBooking(){
        List<Booking> bookings = null;
        bookings =  (List<Booking>) bookingDao.findAll();
        if(bookings == null || bookings.size()<3){
            for(int i = 0;i<3;i++){
                Booking booking = new Booking();
                booking.setBookingAmount("BookingAC"+i);
                booking.setCreatedBy(1L);
                booking.setDropAddress("DropAdd"+i);
                booking.setPickupAddress("PickupAd"+i);
                bookingDao.save(booking);
            }
            bookings =  (List<Booking>) bookingDao.findAll();
        }
        return bookings;
    }
}
