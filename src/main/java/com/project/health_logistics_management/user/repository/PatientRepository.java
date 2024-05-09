package com.project.health_logistics_management.user.repository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.project.health_logistics_management.user.entity.Patient;

import jakarta.persistence.EntityManager;
import jakarta.transaction.Transactional;

@Repository
// public interface PatientRepository extends JpaRepository<Patient, Integer> {

// }

public class PatientRepository {

    @Autowired
    private EntityManager entityManager;

    @Transactional
    public Patient save(Patient patient) {
        entityManager.persist(patient);
        return patient;
    }

    @Transactional
    public List<Patient> findAll() {
        return entityManager.createQuery("SELECT u FROM Patient u", Patient.class).getResultList();
    }

    @Transactional
    public Patient findById(int id) {
        return entityManager.find(Patient.class, id);

    }

    @Transactional
    public void deletePatient(int id) {
        Patient u = findById(id);
        entityManager.remove(u);
    }

    @Transactional
    public Patient updatePatient(Patient patient, int id) {
        Patient existingPatient = findById(id);
        existingPatient.setEmergencyContact(patient.getEmergencyContact());
        existingPatient.setMedicalHistory(patient.getMedicalHistory());
        entityManager.merge(existingPatient);
        return patient;
    }

}