package com.trionix.agrimart.controller;

import com.trionix.agrimart.dto.NewProductDto;
import com.trionix.agrimart.entity.Product;
import com.trionix.agrimart.repository.ProductRepository;
import com.trionix.agrimart.service.ProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class ProductController {

    private final ProductService productService;

    @PostMapping("/products")
    public ResponseEntity<Product> addNewProduct(@RequestBody NewProductDto productDto) {

        var product = productService.addProduct(productDto);
        return ResponseEntity.ok(product);
    }

    @GetMapping("/products")
    public List<Product> getAllProducts () {
    return productService.findAll();

    }


    @GetMapping("/products/{id}")
    public Product getOneProduct (@PathVariable String id){
        return productService.findOne(id);
    }

    @DeleteMapping("/products/{id}")
    public void deleteProduct (@PathVariable String id){
        productService.deleteOne(id);
    }
    @PutMapping("/products/{id}")
    public Product updateProduct (@RequestBody NewProductDto body, @PathVariable String id){
        return productService.updateOne(id, body);
    }

}

