package com.trionix.agrimartorder.repository;

import com.trionix.agrimartorder.entity.Order;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface OrderRepository extends MongoRepository<Order,String> {
}
