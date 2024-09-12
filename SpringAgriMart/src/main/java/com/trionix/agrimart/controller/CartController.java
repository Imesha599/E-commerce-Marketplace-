package com.trionix.agrimart.controller;

import com.trionix.agrimart.dto.CartDto;
import org.springframework.web.bind.annotation.*;

public class CartController {
    @PostMapping("/receiveToCart")
    public String CreateCart(@RequestBody CartDto body)
    {
        System.out.println(body);
        return "CreateCart";
    }

    @DeleteMapping("/receiveToCart/{cartId}")
    public String DeleteCart(@PathVariable CartDto cartId)
    {
        System.out.println(cartId);
        return "DeleteCart";
    }

    @PutMapping("/receiveToCart/{cartId}")
    public String UpdateCart(@RequestBody CartDto body,@PathVariable String cartId)
    {
        System.out.println(cartId);
        return "UpdateCart";
    }
}
