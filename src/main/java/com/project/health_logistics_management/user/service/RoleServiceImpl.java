package com.project.health_logistics_management.user.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.health_logistics_management.user.entity.Role;
import com.project.health_logistics_management.user.repository.RoleRepository;

/**
 * RoleServiceImpl
 */

@Service
public class RoleServiceImpl implements RoleService {

    @Autowired
    private RoleRepository roleRepository;

    @Override
    public Role findById(int id) {
        return roleRepository.findById(id).get();
    }
}