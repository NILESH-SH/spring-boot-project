package com.project.health_logistics_management.user.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.project.health_logistics_management.user.entity.Role;
import com.project.health_logistics_management.user.entity.User;

import jakarta.persistence.EntityManager;
import jakarta.transaction.Transactional;

@Repository
public interface UserRepository extends JpaRepository<User, Integer> {

}

// public class UserRepository{

//     @Autowired
//     private EntityManager entityManager;

//     public User save(User user) {
//         // TODO Auto-generated method stub
//         throw new UnsupportedOperationException("Unimplemented method 'save'");
//     }

//     public List<User> findAll() {
//         // TODO Auto-generated method stub
//         throw new UnsupportedOperationException("Unimplemented method 'findAll'");
//     }

//     public Optional<Role> findById(int id) {
//         // TODO Auto-generated method stub
//         throw new UnsupportedOperationException("Unimplemented method 'findById'");
//     }


// }