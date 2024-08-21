package com.trionix.agrimartorder.service;

import com.trionix.agrimartorder.dto.NewProductDto;
import com.trionix.agrimartorder.entity.Product;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface ProductService {
    Product addProduct(NewProductDto productDto);

    Product updateOne(String id, NewProductDto body);

    void deleteOne(String id);

    Product findOne(String id);

    List<Product> findAll(String keyword, String category);
}
