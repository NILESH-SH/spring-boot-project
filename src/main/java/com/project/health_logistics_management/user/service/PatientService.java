package com.project.health_logistics_management.user.service;

import java.util.List;

import com.project.health_logistics_management.user.entity.Patient;

/**
 * PatientService
 */
public interface PatientService {

    Patient save(Patient patient, int id);

    List<Patient> findAll();

    
}