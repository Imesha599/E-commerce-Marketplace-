package com.trionix.agrimartorder.controller;
import com.trionix.agrimartorder.dto.NewProductDto;
import com.trionix.agrimartorder.entity.Product;
import com.trionix.agrimartorder.service.ProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

    @RestController
//    @CrossOrigin(origins = "http://localhost:3000")
    @RequiredArgsConstructor
    public class ProductController {

        private final ProductService productService;
        @PostMapping("/products")
        public ResponseEntity<Product> addNewProduct(@RequestBody NewProductDto productDto) {

            var product = productService.addProduct(productDto);
            return ResponseEntity.ok(product);
        }
        @GetMapping("/products")
        public List<Product> getAllProducts (@RequestParam(value = "keyword", required = false) String keyword, @RequestParam(value = "category", required = false) String category) {
            return productService.findAll(keyword, category);

        }
        @GetMapping("/productsss/{productid}")
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

