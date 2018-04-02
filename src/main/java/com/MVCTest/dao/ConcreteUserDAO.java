package com.MVCTest.dao;

import com.MVCTest.entity.User;
import com.MVCTest.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class ConcreteUserDAO implements UserDAO {

    public final JdbcTemplate jdbcTemplate;

    @Autowired
    public ConcreteUserDAO(JdbcTemplate jdbcTemplate) {this.jdbcTemplate = jdbcTemplate; }

    public User getById(int id) {
        String sql = "SELECT * FROM customers WHERE id=?";
        return jdbcTemplate.queryForObject(sql, new UserMapper(), id);
    }

    public List<User> findAll() {
        String sql = "SELECT * FROM customers";
        return jdbcTemplate.query(sql, new UserMapper());
    }

    public void save(User user) {
        String sql = "INSERT INTO customers(name, address, city, state, zip) VALUES (?,?,?,?,?)";
        jdbcTemplate.update(sql, user.getName(), user.getAddress(), user.getCity(), user.getState(), user.getZip());
    }

    public void update(User user) {
        String sql = "UPDATE customers SET name=?, address=?, city=?, state=?, zip=? WHERE id=?";
        jdbcTemplate.update(sql, user.getName(), user.getAddress(), user.getCity(), user.getState(), user.getZip(), user.getId());
    }

    public void delete(int id) {
        String sql = "DELETE FROM customers WHERE id=?";
        jdbcTemplate.update(sql, id);
    }
}
