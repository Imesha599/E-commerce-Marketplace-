package com.trionix.agrimart.repository;

import com.trionix.agrimart.entity.ShippingDetails;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ShippingDetailsRepository extends MongoRepository<ShippingDetails,String> {



}
