package com.project.health_logistics_management.user.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.health_logistics_management.user.entity.Doctor;
import com.project.health_logistics_management.user.repository.DoctorRepository;
import com.project.health_logistics_management.user.repository.UserRepository;

/**
 * DoctorServiceImpl
 */

 @Service
public class DoctorServiceImpl implements DoctorService{

    @Autowired
    private DoctorRepository doctorRepository;

    @Autowired
    private UserRepository userRepository;

    @Override
    public Doctor save(Doctor doctor, int id) {
        doctor.setUser(userRepository.findById(id).get());
        return doctorRepository.save(doctor);
    }

    
}