package com.example.demo.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.example.demo.domain.Point;

public interface PointRepository extends MongoRepository<Point, String> {

}
