package com.MVCTest.service;

import com.MVCTest.entity.User;
import java.util.List;

public interface UserService {
    User getById(int id);
    List<User> findAll();

    void save(User user);
    void update(User user);
    void delete(int id);
}
