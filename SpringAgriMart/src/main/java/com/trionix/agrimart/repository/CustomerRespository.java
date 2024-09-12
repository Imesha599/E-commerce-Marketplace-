package com.example.trionix.agrimart.repository;

import com.example.trionix.agrimart.entity.Customer;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface CustomerRespository extends MongoRepository<Customer,String>
 {
}
