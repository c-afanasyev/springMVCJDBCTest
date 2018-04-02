package com.MVCTest.dao;

import com.MVCTest.entity.User;

import java.util.List;

public interface UserDAO {
    User getById(int id);
    List<User> findAll();

    void save(User user);
    void update(User user);
    void delete(int id);
}
