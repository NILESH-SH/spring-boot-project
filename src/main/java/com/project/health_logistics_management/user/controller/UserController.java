package com.project.health_logistics_management.user.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.project.health_logistics_management.user.entity.Doctor;
import com.project.health_logistics_management.user.entity.Patient;
import com.project.health_logistics_management.user.entity.User;
import com.project.health_logistics_management.user.errorHandling.NothingFound;
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

    @DeleteMapping("/delete-user-id/{id}")
    public String deleteUserId(@PathVariable int id){
        userService.deleteUserById(id);
        return "Successfull";
    }

    @PutMapping("/update-user-id/{id}")
    public User updateUser(@RequestBody User user , @PathVariable int id){

        return userService.updateUserById(user, id);
    }
    // Patient Controller

    @PostMapping("/save-patient/{id}")
    public Object savePatient(@RequestBody Patient patient, @PathVariable int id) {
        Patient savedPatient = patientService.save(patient,id);
        if (savedPatient == null) {
            return "Error!";
        }
        return savedPatient;
    }

    @GetMapping("/all-patient")
    public List<Patient> getAllPatient() {
        return patientService.findAll();
    }

    // Doctor Controller

    @PostMapping("/save-doctor/{id}")
    public Object saveDoctor(@RequestBody Doctor doctor, @PathVariable int id) {
        Doctor savedDoctor = doctorService.save(doctor, id);
        if (savedDoctor == null) {
            return "Error ! Can't save Patient to Doctor";
            
        }
        return savedDoctor;
    }

    @PostMapping("/doctor-id/{id}/appointments")
    public Object getAppoinments(@PathVariable int id){
        return doctorService.getAllAppoinments(id);
    }


    @Autowired
    private NothingFound nothingFound;

    @GetMapping("/doctor-id/{id}")
    public Object getAllDoctor(@PathVariable int id){
        Doctor d = doctorService.fetchDoctor(id);
        if (d == null) {
            // return "Nothing found";
            return nothingFound;
        }
        // System.out.println(d);
        return doctorService.fetchDoctor(id);
    }
}
