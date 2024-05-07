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
import com.project.health_logistics_management.user.service.DoctorService;
import com.project.health_logistics_management.user.service.PatientService;
import com.project.health_logistics_management.user.service.UserService;

@RestController
@RequestMapping("/project")
public class UserController {

    @Autowired
    private UserService userService;

    @Autowired
    private PatientService patientService;

    @Autowired
    private DoctorService doctorService;


    // User Controller

    @PostMapping("/save-user/{id}")
    public User saveUser(@RequestBody User user, @PathVariable int id) {
        return userService.save(user,id);
    }

    @GetMapping("/all-user")
    public List<User> getUser() {
        return userService.findAll();
    }

    @GetMapping("/user-id/{id}")
    public User getUserById(@PathVariable int id) {
        return userService.findById(id);
    }

    // Patient Controller

    @PostMapping("/save-patient/{id}")
    public Patient savePatient(@RequestBody Patient patient, @PathVariable int id) {
        return patientService.save(patient,id);
    }

    @GetMapping("/all-patient")
    public List<Patient> getAllPatient() {
        return patientService.findAll();
    }

    // Doctor Controller

    @PostMapping("/save-doctor/{id}")
    public Doctor saveDoctor(@RequestBody Doctor doctor, @PathVariable int id) {
        // doctor.setUser(getUserById(id));
        return doctorService.save(doctor,id);
    }
}
