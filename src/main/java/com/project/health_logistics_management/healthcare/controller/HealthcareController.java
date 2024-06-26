package com.project.health_logistics_management.healthcare.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.project.health_logistics_management.healthcare.entity.Appoinments;
import com.project.health_logistics_management.healthcare.service.AppointmentsService;

@RestController
@RequestMapping("/healthcare")
public class HealthcareController {

    @Autowired
    private AppointmentsService appointmentsService;

    @PostMapping("/appointments/doctor-id/{did}/patient-id/{pid}")
    public Appoinments saveAppoinments(@RequestBody Appoinments appoinments, @PathVariable int did,
            @PathVariable int pid) {
        return appointmentsService.saveAppoinments(appoinments,did,pid);
    }

    @GetMapping("/all-appointments")
    public Object getAllAppoinments(){
        return appointmentsService.getAppoinments();
    }
}
