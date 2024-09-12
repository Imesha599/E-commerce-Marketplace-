package com.agriMart.demo.repository;
import com.agriMart.demo.entity.Delivery;

import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;


public interface DeliveryRepository extends MongoRepository<Delivery,String>{


}
