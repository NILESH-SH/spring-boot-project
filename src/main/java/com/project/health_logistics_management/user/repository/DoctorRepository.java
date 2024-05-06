package com.project.health_logistics_management.user.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.project.health_logistics_management.user.entity.Doctor;

public interface DoctorRepository extends JpaRepository<Doctor, Integer> {

}
