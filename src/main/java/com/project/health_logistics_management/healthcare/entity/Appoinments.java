package com.project.health_logistics_management.healthcare.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.project.health_logistics_management.user.entity.Doctor;
import com.project.health_logistics_management.user.entity.Patient;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Appoinments
 */

 @Entity
 @Data
 @AllArgsConstructor
 @NoArgsConstructor
public class Appoinments {


    @Id
    @GeneratedValue(strategy =  GenerationType.IDENTITY)
    private Integer id;

    private String appointmentTime;

    private Boolean status;

    @ManyToOne
    @JoinColumn
    @JsonIgnore
    private Doctor doctor;

    @ManyToOne
    @JoinColumn
    @JsonIgnore
    private Patient patient;
}