package com.trionix.agrimartorder.repository;

import com.trionix.agrimartorder.entity.DeliveryDetails;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface DeliveryDetailsRepository extends MongoRepository<DeliveryDetails,String> {
}
