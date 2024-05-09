package com.project.health_logistics_management.user.entity;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.project.health_logistics_management.healthcare.entity.Appoinments;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Doctor {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String qualification;

    private String specialization;

    private String contactDetails;

    @OneToOne
    @JoinColumn(name = "user_id", nullable = false, unique = true)
    @JsonIgnore
    private User user;

    @OneToMany(mappedBy = "doctor")
    private List<Appoinments> appoinments;

}
