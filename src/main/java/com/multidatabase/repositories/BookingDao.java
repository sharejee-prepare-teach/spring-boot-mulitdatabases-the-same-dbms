package com.multidatabase.repositories;

import com.multidatabase.domain.Booking;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by : Ron Rith
 * Create Date: 03/16/2018.
 */
public interface BookingDao extends CrudRepository<Booking,Long> {
    List findByCreatedBy(Long userId);
}
