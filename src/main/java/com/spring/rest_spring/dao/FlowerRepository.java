package com.spring.rest_spring.dao;

import com.spring.rest_spring.entity.Flower;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FlowerRepository extends JpaRepository<Flower, Integer> {
}
