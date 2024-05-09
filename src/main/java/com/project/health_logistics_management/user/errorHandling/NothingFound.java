package com.project.health_logistics_management.user.errorHandling;

import org.springframework.stereotype.Component;

import lombok.Data;

@Component
@Data
public class NothingFound {
     private String error = "Nothing found";
}
