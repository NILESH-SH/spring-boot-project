package com.project.health_logistics_management.user.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.health_logistics_management.user.entity.User;
import com.project.health_logistics_management.user.repository.RoleRepository;
import com.project.health_logistics_management.user.repository.UserRepository;
import com.project.health_logistics_management.user.utils.CustomHashingPassword;

/**
 * UserServiceImpl
 */

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private RoleRepository roleRepository;


    @Override
    public User save(User user, int id) {
        user.setPasswordHash(CustomHashingPassword.customHash(user.getPasswordHash()));
        user.setRole(roleRepository.findById(id).get());
        return userRepository.save(user);
    }


    @Override
    public List<User> findAll() {
       return userRepository.findAll();
    }


    @Override
    public User findById(int id) {
       return userRepository.findById(id);
    }


    @Override
    public void deleteUserById(int id) {
        userRepository.deleteUser(id);
    }


    @Override
    public User updateUserById(User user, int id) {
        return userRepository.updateUser(user, id);
    }
}