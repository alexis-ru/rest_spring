package com.spring.rest_spring.service;

import com.spring.rest_spring.entity.Flower;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class FlowerServiceImplements implements FlowerService{

    @Autowired(required=false)
    private Flower flower;

    @Override
    public List<Flower> getAllFlowers() {
        return getAllFlowers();
    }

    @Override
    public void saveFlower(Flower flower) {
        saveFlower(flower);
    }

    @Override
    public Flower getFlower(int id) {
        return getFlower(id);
    }

    @Override
    public void deleteFlower(int id) {
        deleteFlower(id);
    }
}
