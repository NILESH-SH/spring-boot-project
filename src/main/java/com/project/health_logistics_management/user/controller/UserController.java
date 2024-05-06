package com.project.health_logistics_management.user.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.project.health_logistics_management.user.entity.Doctor;
import com.project.health_logistics_management.user.entity.Patient;
import com.project.health_logistics_management.user.entity.User;
import com.project.health_logistics_management.user.repository.DoctorRepository;
import com.project.health_logistics_management.user.repository.PatientRepository;
import com.project.health_logistics_management.user.repository.UserRepository;

@RestController
@RequestMapping("/project")
public class UserController {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private PatientRepository patientRepository;

    @Autowired
    private DoctorRepository doctorRepository;

    // User Controller

    @PostMapping("/save-user")
    public User saveUser(@RequestBody User user) {
        return userRepository.save(user);
    }

    @GetMapping("/all-user")
    public List<User> getUser() {
        return userRepository.findAll();
    }

    @GetMapping("/user-id/{id}")
    public User getUserById(@PathVariable int id) {
        return userRepository.findById(id).get();
    }

    // Patient Controller

    @PostMapping("/save-patient/{id}")
    public Patient savePatient(@RequestBody Patient patient, @PathVariable int id) {
        patient.setUser(getUserById(id));
        return patientRepository.save(patient);
    }

    // Doctor Controller

    @PostMapping("/save-doctor/{id}")
    public Doctor saveDoctor(@RequestBody Doctor doctor, @PathVariable int id) {
        doctor.setUser(getUserById(id));
        return doctorRepository.save(doctor);
    }
}
