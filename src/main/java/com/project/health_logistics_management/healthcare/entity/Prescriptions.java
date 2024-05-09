package com.project.health_logistics_management.healthcare.entity;

import com.project.health_logistics_management.user.entity.Doctor;
import com.project.health_logistics_management.user.entity.Patient;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Prescriptions
 */

 @Entity
 @NoArgsConstructor
 @AllArgsConstructor
 @Data
public class Prescriptions {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String medicationDetails;

    private int dosage;

    private int refillinfo;



    private Patient patient;

    private Doctor doctor;
}