package com.project.health_logistics_management.user.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.health_logistics_management.user.entity.Patient;
import com.project.health_logistics_management.user.entity.User;
import com.project.health_logistics_management.user.repository.PatientRepository;
import com.project.health_logistics_management.user.repository.UserRepository;

/**
 * PatientServiceImpl
 */

 @Service
public class PatientServiceImpl implements PatientService{

    
    @Autowired
    private PatientRepository patientRepository;

    @Autowired
    private UserRepository userRepository;

    @Override
    public Patient save(Patient patient, int id) {
            User u = userRepository.findById(id);
        // System.out.println(u.getRole().getId());
        if (u.getRole().getId() == 1) {
            // System.out.println("Doctor");
            patient.setUser(userRepository.findById(id));
            return patientRepository.save(patient);
        }
        return null;
    }

    @Override
    public List<Patient> findAll() {
        return patientRepository.findAll();
    }
}