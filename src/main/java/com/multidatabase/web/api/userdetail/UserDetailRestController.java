package com.multidatabase.web.api.userdetail;

import com.multidatabase.domain.UserDetails;
import com.multidatabase.services.userdetail.UserServicei;
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
@RequestMapping(value = "/api/userdetail")
public class UserDetailRestController {
    @Autowired
    private UserServicei userDao;

    @RequestMapping(method = RequestMethod.GET)
    private List<UserDetails> getAllUserDetail(){
        return (List<UserDetails>) userDao.getAllUsers();
    }
}
