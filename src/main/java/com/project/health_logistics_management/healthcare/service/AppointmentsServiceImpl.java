package com.project.health_logistics_management.healthcare.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.health_logistics_management.healthcare.entity.Appoinments;
import com.project.health_logistics_management.healthcare.repository.AppointMentsRepository;

/**
 * AppointmentsServiceImpl
 */

 @Service
public class AppointmentsServiceImpl implements AppointmentsService {


    @Autowired
    private AppointMentsRepository appointMentsRepository;
    @Override
    public Appoinments saveAppoinments(Appoinments appoinments) {

        return appointMentsRepository.save(appoinments);
    }


    
}