package com.example.brunopbrito31.fcrudapi.model.services;

import com.example.brunopbrito31.fcrudapi.model.entities.User;
import com.example.brunopbrito31.fcrudapi.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public List<User> findAll(){
        return userRepository.findAll();
    }

    public Optional<User> findById(Long id){
        return userRepository.findById(id);
    }

    public User insert(User obj){
        return userRepository.save(obj);
    }
}
