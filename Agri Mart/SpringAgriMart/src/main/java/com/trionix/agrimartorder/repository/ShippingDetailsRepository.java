package com.trionix.agrimartorder.repository;

import com.trionix.agrimartorder.entity.ShippingDetails;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ShippingDetailsRepository extends MongoRepository<ShippingDetails,String> {



}
