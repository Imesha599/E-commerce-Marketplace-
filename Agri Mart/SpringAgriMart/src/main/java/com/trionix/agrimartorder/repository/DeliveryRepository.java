package com.trionix.agrimartorder.repository;


import com.trionix.agrimartorder.entity.Delivery;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface DeliveryRepository extends MongoRepository<Delivery,String> {
}
