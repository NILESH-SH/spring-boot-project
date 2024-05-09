package com.project.health_logistics_management.user.service;

import com.project.health_logistics_management.user.entity.Doctor;

/**
 * DoctorService
 */
public interface DoctorService {


    Doctor save(Doctor doctor, int id);

    Object getAllAppoinments(int id);

    Doctor fetchDoctor(int id);

    
}