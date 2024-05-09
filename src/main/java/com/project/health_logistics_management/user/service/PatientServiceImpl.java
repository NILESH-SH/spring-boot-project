package com.project.health_logistics_management.user.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.health_logistics_management.user.entity.Patient;
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
        patient.setUser(userRepository.findById(id));
      return patientRepository.save(patient);
    }

    @Override
    public List<Patient> findAll() {
        return patientRepository.findAll();
    }
}