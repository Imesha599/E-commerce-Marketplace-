package com.trionix.agrimartorder.controller;
import com.trionix.agrimartorder.dto.CartDto;
import com.trionix.agrimartorder.entity.Cart;
import com.trionix.agrimartorder.entity.Product;
import com.trionix.agrimartorder.repository.CartRepository;
import com.trionix.agrimartorder.repository.ProductRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequiredArgsConstructor
public class CartController {

    private final CartRepository cartRepository;
    private final ProductRepository productRepository;
    @PostMapping("/receiveToCart")
    public String createCart(@RequestBody CartDto body)
    {
        Optional<Cart> byProductProductId = cartRepository.findByProductProductId(body.getProductId());
        if(byProductProductId.isPresent()){
            Cart cart = byProductProductId.get();
            cart.setQuantity(cart.getQuantity() + 1);
            cart.setTotalPrice(cart.getProduct().getPrice() + cart.getTotalPrice());
            return cartRepository.save(cart).getCardId();

        }else {
            Optional<Product> byId = productRepository.findById(body.getProductId());
            if (byId.isPresent()) {
                Cart cart = new Cart();
                cart.setProduct(byId.get());
                cart.setQuantity(1);
                cart.setTotalPrice(byId.get().getPrice());
                return cartRepository.save(cart).getCardId();
            }else {
                return null;
            }
        }
    }

    @GetMapping("/receiveToCart")
    public List<Cart> getCart()
    {

        return cartRepository.findAll();
    }

    @DeleteMapping("/receiveToCart/{cartId}")
    public String deleteCart(@PathVariable CartDto cartId)
    {
        System.out.println(cartId);
        return "DeleteCart";
    }

    @PutMapping("/receiveToCart/{cartId}")
    public String updateCart(@RequestBody CartDto body,@PathVariable String cartId)
    {
        System.out.println(cartId);
        return "UpdateCart";
    }
}
