package com.project.health_logistics_management.healthcare.service;

import com.project.health_logistics_management.healthcare.entity.Appoinments;

/**
 * AppointmentsService
 */
public interface AppointmentsService {

    Appoinments saveAppoinments(Appoinments appoinments, int did, int pid);

    
}