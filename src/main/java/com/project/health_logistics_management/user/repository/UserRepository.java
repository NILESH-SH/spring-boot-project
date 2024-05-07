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
// public interface UserRepository extends JpaRepository<User, Integer> {

// }

public class UserRepository {

    @Autowired
    private EntityManager entityManager;

    @Transactional
    public User save(User user) {
        entityManager.persist(user);
        return user;
    }

    @Transactional
    public List<User> findAll() {
        return entityManager.createQuery("SELECT u FROM User u", User.class).getResultList();
    }

    @Transactional
    public User findById(int id) {
        return entityManager.find(User.class, id);

    }

    @Transactional
    public void deleteUser(int id) {
        User u =  findById(id);
        entityManager.remove(u);
    }

    @Transactional
    public User updateUser(User user, int id) {
        User existingUser = findById(id);
        existingUser.setUserName(user.getUserName());
        entityManager.merge(existingUser);
        return user;
    }

}