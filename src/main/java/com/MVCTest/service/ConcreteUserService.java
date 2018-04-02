package com.MVCTest.service;

import com.MVCTest.dao.UserDAO;
import com.MVCTest.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class ConcreteUserService implements UserService{

    @Autowired
    public UserDAO userDAO;

    public User getById(int id) {
        return userDAO.getById(id);
    }

    public List<User> findAll() {
        return userDAO.findAll();
    }

    public void save(User user) {
        userDAO.save(user);
    }

    public void update(User user) {
        userDAO.update(user);
    }

    public void delete(int id) {
        userDAO.delete(id);
    }
}
