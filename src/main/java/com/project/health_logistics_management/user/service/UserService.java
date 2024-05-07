package com.project.health_logistics_management.user.service;

import java.util.List;

import com.project.health_logistics_management.user.entity.User;

/**
 * UserService
 */
public interface UserService {


    User save(User user, int id);

    List<User> findAll();

    User findById(int id);

    
}