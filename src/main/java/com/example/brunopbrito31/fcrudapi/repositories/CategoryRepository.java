package com.example.brunopbrito31.fcrudapi.repositories;

import com.example.brunopbrito31.fcrudapi.model.entities.Category;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CategoryRepository extends JpaRepository<Category, Long> {
}
