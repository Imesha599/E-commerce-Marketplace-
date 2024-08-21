package com.trionix.agrimartorder.repository;

import com.trionix.agrimartorder.entity.Cart;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.Optional;

public interface CartRepository  extends MongoRepository<Cart, String> {
    Optional<Cart> findByProductProductId(String product_productId);

//    List<Cart> findAllByProductTitleLike(String productTitle);
}
