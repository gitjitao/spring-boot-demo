package com.b2b.crm.service;

import java.util.List;
import javax.annotation.Resource;
import org.springframework.stereotype.Service;

import com.b2b.crm.dao.UserDao;
import com.b2b.crm.model.User;

@Service
public class UserService {

    @Resource
    private UserDao userDao;

    public User getUser(long id) {
        return userDao.get(id);
    }

    public List<User> listAllUser() {
        return userDao.find();
    }
}
