package com.example.brunopbrito31.fcrudapi.model.services;

import com.example.brunopbrito31.fcrudapi.model.entities.Order;
import com.example.brunopbrito31.fcrudapi.repositories.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.List;
import java.util.Optional;

@Service
public class OrderService {

    @Autowired
    private OrderRepository orderRepository;

    public List<Order> findAll(){
        return orderRepository.findAll();
    }

    public Order findById(Long id){
        Optional<Order> opt = orderRepository.findById(id);
        return opt.get();
    }

}
