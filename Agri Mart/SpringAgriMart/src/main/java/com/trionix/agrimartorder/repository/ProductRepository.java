package com.trionix.agrimartorder.repository;


import com.trionix.agrimartorder.entity.Product;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProductRepository extends MongoRepository<Product,String> {
    List<Product> findAllByProductTitleLike( String productTitle);
}