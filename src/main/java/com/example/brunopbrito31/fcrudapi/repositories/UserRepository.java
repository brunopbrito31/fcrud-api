package com.example.brunopbrito31.fcrudapi.repositories;

import com.example.brunopbrito31.fcrudapi.model.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
}
