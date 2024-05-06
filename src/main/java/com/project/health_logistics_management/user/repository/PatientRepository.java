package com.project.health_logistics_management.user.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.project.health_logistics_management.user.entity.Patient;

@Repository
public interface PatientRepository extends JpaRepository<Patient, Integer> {

}
