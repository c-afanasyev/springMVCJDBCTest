package com.MVCTest.config;

import com.MVCTest.dao.ConcreteUserDAO;
import com.MVCTest.dao.UserDAO;
import com.MVCTest.service.ConcreteUserService;
import com.MVCTest.service.UserService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import javax.sql.DataSource;

@Configuration
public class SpringConfig {

    @Bean
    public JdbcTemplate getJdbcTemplate(){
        return new JdbcTemplate(getDataSource());
    }

    private DataSource getDataSource() {
        DriverManagerDataSource dataSource = new DriverManagerDataSource();
        dataSource.setUrl("jdbc:mysql://localhost:3306/demo?useSSL=false");
        dataSource.setUsername("root");
        dataSource.setPassword("");
        dataSource.setDriverClassName("com.mysql.jdbc.Driver");
        return dataSource;
    }

    @Bean
    public UserDAO getUserDAO() {
        return new ConcreteUserDAO(getJdbcTemplate());
    }

    @Bean
    public UserService getUserService(){
        return new ConcreteUserService();
    }

}
