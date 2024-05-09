package com.project.health_logistics_management.user.repository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.project.health_logistics_management.user.entity.Doctor;

import jakarta.persistence.EntityManager;
import jakarta.transaction.Transactional;

@Repository
// public interface DoctorRepository extends JpaRepository<Doctor, Integer> {

// }

/**
 * DoctorRepository
 */
public class DoctorRepository {

    @Autowired
    private EntityManager entityManager;

    @Transactional
    public Doctor save(Doctor doctor) {
        entityManager.persist(doctor);
        return doctor;
    }

    @Transactional
    public List<Doctor> findAll() {
        return entityManager.createQuery("SELECT u FROM Doctor u", Doctor.class).getResultList();
    }

    @Transactional
    public Doctor findById(int id) {
        return entityManager.find(Doctor.class, id);

    }

    @Transactional
    public void deleteDoctor(int id) {
        Doctor u = findById(id);
        entityManager.remove(u);
    }

    @Transactional
    public Doctor updateDoctor(Doctor Doctor, int id) {
        Doctor existingDoctor = findById(id);
        existingDoctor.setContactDetails(Doctor.getContactDetails());
        entityManager.merge(existingDoctor);
        return Doctor;
    }

}