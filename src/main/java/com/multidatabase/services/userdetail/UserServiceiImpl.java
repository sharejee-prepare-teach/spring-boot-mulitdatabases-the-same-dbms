package com.multidatabase.services.userdetail;

import com.multidatabase.domain.UserDetails;
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
public class UserServiceiImpl implements UserServicei {
    @Autowired
    private UserDao userDao;

    @Override
    public List<UserDetails> getAllUsers() {
        List<UserDetails> userDetails = null;
        userDetails = (List<UserDetails>) userDao.findAll();
        if (userDetails == null || userDetails.size() < 3) {
            for (int i = 0; i < 3; i++) {
                UserDetails userDetails1 = new UserDetails();
                userDetails1.setEmail("user@gmail.com" + i);
                userDetails1.setFirstName("firstname" + i);
                userDetails1.setLastName("lastname" + i);
                userDetails1.setPassword("password" + i);
                userDao.save(userDetails1);
            }
            userDetails = (List<UserDetails>) userDao.findAll();
        }
        return userDetails;
    }
}
