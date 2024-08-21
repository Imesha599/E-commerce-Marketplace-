package com.trionix.agrimartorder.service.impl;
import com.trionix.agrimartorder.dto.NewProductDto;
import com.trionix.agrimartorder.entity.Product;
import com.trionix.agrimartorder.repository.ProductRepository;
import com.trionix.agrimartorder.service.ProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ProductServiceImpl implements ProductService {

    private final ProductRepository productRepository;

    @Override
    public Product addProduct(NewProductDto productDto) {
        Product product = new Product();
        product.setProductTitle(productDto.getProductTitle());
        product.setCategory(productDto.getCategory());
        product.setDescription(productDto.getDescription());
        product.setQuantity(productDto.getQuantity());
        product.setPrice(productDto.getPrice());
        return productRepository.save(product);

    }

    @Override
    public Product updateOne(String id, NewProductDto productDto) {
        var p = productRepository.findById(id);
        if(p.isEmpty())
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Cannot find product");
        var product = p.get();
        product.setProductTitle(productDto.getProductTitle());
        product.setCategory(productDto.getCategory());
        product.setDescription(productDto.getDescription());
        product.setQuantity(productDto.getQuantity());
        product.setPrice(productDto.getPrice());

        return productRepository.save(product);
    }

    @Override
    public void deleteOne(String id) {
        productRepository.deleteById(id);
    }

    @Override
    public Product findOne(String id) {
        var p = productRepository.findById(id);
        if(p.isEmpty())
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Cannot find product");
        return p.get();
    }

    @Override
    public List<Product> findAll(String keyword, String category) {
        if((keyword != null && !keyword.isEmpty()) || (category != null   && !category.isEmpty()))
            return productRepository.findAllByProductTitleLike( keyword);
        else
           return productRepository.findAll();
    }


}
