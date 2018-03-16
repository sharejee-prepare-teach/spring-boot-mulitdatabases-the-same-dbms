package com.multidatabase.web.api.booking;

import com.multidatabase.domain.Booking;
import com.multidatabase.repositories.BookingDao;
import com.multidatabase.services.booking.BookingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by : Ron Rith
 * Create Date: 03/16/2018.
 */
@RestController
@RequestMapping(value = "/api/booking")
public class BookingRestController {
    @Autowired
    private BookingService bookingDao;

    @RequestMapping(method = RequestMethod.GET)
    private List<Booking> getAllBooking() {
        return (List<Booking>) bookingDao.getAllBooking();
    }
}
