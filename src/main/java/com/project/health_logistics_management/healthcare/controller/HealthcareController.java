package com.project.health_logistics_management.healthcare.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
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

    @GetMapping("/appointments")
    public Appoinments saveAppoinments(@RequestBody Appoinments appoinments){

        return appointmentsService.saveAppoinments(appoinments);
    }
}
