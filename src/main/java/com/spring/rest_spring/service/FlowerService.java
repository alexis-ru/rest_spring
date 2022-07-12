package com.spring.rest_spring.service;

import com.spring.rest_spring.entity.Flower;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface FlowerService {

    public List<Flower> getAllFlowers();

    public void saveFlower(Flower flower);

    public Flower getFlower(int id);

    public void deleteFlower(int id);
}
