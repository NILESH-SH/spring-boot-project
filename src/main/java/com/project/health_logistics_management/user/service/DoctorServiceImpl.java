package com.project.health_logistics_management.user.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.health_logistics_management.healthcare.repository.AppointMentsRepository;
import com.project.health_logistics_management.user.entity.Doctor;
import com.project.health_logistics_management.user.entity.User;
import com.project.health_logistics_management.user.repository.DoctorRepository;
import com.project.health_logistics_management.user.repository.UserRepository;

/**
 * DoctorServiceImpl
 */

@Service
public class DoctorServiceImpl implements DoctorService {

    @Autowired
    private DoctorRepository doctorRepository;

    @Autowired
    private AppointMentsRepository appointMentsRepository;

    @Autowired
    private UserRepository userRepository;

    @Override
    public Doctor save(Doctor doctor, int id) {
        User u = userRepository.findById(id);
        // System.out.println(u.getRole().getId());
        if (u.getRole().getId() == 2) {
            // System.out.println("Doctor");
            doctor.setUser(userRepository.findById(id));
            return doctorRepository.save(doctor);
        }
        return null;
    }

    @Override
    public Object getAllAppoinments(int id) {

        return doctorRepository.allAppoinments(id);
    }

    @Override
    public Doctor fetchDoctor(int id) {
        return doctorRepository.allDoctors(id);
    }

}