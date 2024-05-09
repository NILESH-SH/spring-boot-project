package com.project.health_logistics_management.healthcare.service;

import java.util.List;

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
    public Appoinments saveAppoinments(Appoinments appoinments, int did, int pid) {
                return appointMentsRepository.save(appoinments,did,pid);

    }

    @Override
    public Object getAppoinments() {
        System.out.println(appointMentsRepository.allAppoinments());
        return appointMentsRepository.allAppoinments();
    }

}
