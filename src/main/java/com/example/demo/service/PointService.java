package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.domain.Point;
import com.example.demo.repository.PointRepository;

@Service
public class PointService {
	
	@Autowired
	PointRepository pointRepository;
	
	
	public Point createPoint(Point point) {
		return pointRepository.save(point);
	}

}
