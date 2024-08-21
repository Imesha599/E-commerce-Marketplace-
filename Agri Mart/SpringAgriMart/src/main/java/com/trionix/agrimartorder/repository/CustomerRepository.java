package com.trionix.agrimartorder.repository;

import com.trionix.agrimartorder.entity.Customer;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface CustomerRepository extends MongoRepository<Customer,String> {
}
