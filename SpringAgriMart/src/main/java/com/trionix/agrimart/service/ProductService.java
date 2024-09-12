package com.trionix.agrimart.service;

import com.trionix.agrimart.dto.NewProductDto;
import com.trionix.agrimart.entity.Product;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface ProductService {
    Product addProduct(NewProductDto productDto);

    Product updateOne(String id, NewProductDto body);

    void deleteOne(String id);

    Product findOne(String id);

    List<Product> findAll();
}
