
package com.project.health_logistics_management.healthcare.repository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.project.health_logistics_management.healthcare.entity.Appoinments;
import com.project.health_logistics_management.user.repository.DoctorRepository;
import com.project.health_logistics_management.user.repository.PatientRepository;

import jakarta.persistence.EntityManager;
import jakarta.transaction.Transactional;

/**
 * AppointMentsRepository
 */

@Repository
public class AppointMentsRepository {

    @Autowired
    private EntityManager entityManager;

    @Autowired
    private DoctorRepository doctorRepository;

    @Autowired 
    private PatientRepository patientRepository;

    @Transactional
    public Appoinments save(Appoinments appoinments, int did, int pid) {
        appoinments.setDoctor(doctorRepository.findById(did));
        appoinments.setPatient(patientRepository.findById(pid));
        entityManager.persist(appoinments);
        return appoinments;
    }

    public Object allAppoinments() {

        return entityManager.createQuery("Select a from Appoinments a",Appoinments.class).getResultList();
    }


}