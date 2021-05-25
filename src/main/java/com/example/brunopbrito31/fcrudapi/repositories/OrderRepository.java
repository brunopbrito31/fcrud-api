package com.example.brunopbrito31.fcrudapi.repositories;

import com.example.brunopbrito31.fcrudapi.model.entities.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Long> {
}
