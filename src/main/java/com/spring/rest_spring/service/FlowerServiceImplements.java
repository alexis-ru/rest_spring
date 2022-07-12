package com.spring.rest_spring.service;

import com.spring.rest_spring.dao.FlowerRepository;
import com.spring.rest_spring.entity.Flower;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FlowerServiceImplements implements FlowerService{

    private final FlowerRepository flowerRepository;

    @Autowired
    public FlowerServiceImplements(FlowerRepository flowerRepository) {
        this.flowerRepository = flowerRepository;
    }

    @Override
    public List<Flower> getAllFlowers() {
        return flowerRepository.findAll();
    }

    @Override
    public void saveFlower(Flower flower) {
        flowerRepository.save(flower);
    }

    @Override
    public Flower getFlower(int id) {
        return  flowerRepository.getReferenceById(id);
    }

    @Override
    public void deleteFlower(int id) {
        flowerRepository.deleteById(id);
    }
}
