package com.multidatabase.repositories;

import com.multidatabase.domain.UserDetails;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by : Ron Rith
 * Create Date: 03/16/2018.
 */
public interface UserDao extends CrudRepository<UserDetails,Long> {
    UserDetails findByEmail(String email);
}
