
package com.project.health_logistics_management.healthcare.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.project.health_logistics_management.healthcare.entity.Appoinments;

import jakarta.persistence.EntityManager;

/**
 * AppointMentsRepository
 */

@Repository
public class AppointMentsRepository {

    @Autowired
    private EntityManager entityManager;

    public Appoinments save(Appoinments appoinments) {

        entityManager.persist(appoinments);
        return appoinments;

    }

}