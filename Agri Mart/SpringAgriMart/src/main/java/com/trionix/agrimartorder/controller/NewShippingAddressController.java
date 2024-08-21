package com.trionix.agrimartorder.controller;
import com.trionix.agrimartorder.dto.NewShippingAddressDto;
import org.springframework.web.bind.annotation.*;

@RestController
public class NewShippingAddressController {
    @PostMapping("/shipping")
    public String createShippingDetails(@RequestBody NewShippingAddressDto body)
    {
        System.out.println(body);
        return "CreateShippingDetails";
    }

    @GetMapping("/shipping")
    public String getAllShippingAddress()
    {
        return "CreateShippingDetails";
    }

    @DeleteMapping("/shipping/{shippingId}")
    public String deleteShippingAddress(@PathVariable String shippingId)
    {
        System.out.println(shippingId);
        return "DeleteShippingDetails";
    }

    @PutMapping("/shipping/{shippingId}")
    public String updateShippingAddress(@RequestBody NewShippingAddressDto body, @PathVariable String shippingId)
    {
        System.out.println(body);
        System.out.println(shippingId);
        return "UpdateShippingDetails";
    }
}
