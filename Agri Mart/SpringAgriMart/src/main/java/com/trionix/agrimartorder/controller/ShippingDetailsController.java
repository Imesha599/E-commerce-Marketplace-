package com.trionix.agrimartorder.controller;

import com.trionix.agrimartorder.entity.ShippingDetails;
import com.trionix.agrimartorder.repository.ShippingDetailsRepository;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;


//@Document("ShippingDetails")

@RestController
@CrossOrigin(origins = "http://localhost:3000")
public class ShippingDetailsController {

    private final ShippingDetailsRepository shippingDetailsRepository;

    public ShippingDetailsController(ShippingDetailsRepository shippingDetailsRepository) {this.shippingDetailsRepository = shippingDetailsRepository;}

    @GetMapping("/getList")
    public ResponseEntity<List<ShippingDetails>> getAllOrders() {
        return ResponseEntity.ok(this.shippingDetailsRepository.findAll());

    }

    @PostMapping("/createShipping")
    public ResponseEntity<ShippingDetails> createOrders(@RequestBody ShippingDetails ShippingDetailsDto) {
        ShippingDetails shippingDetails=new ShippingDetails();
        shippingDetails.setFName(ShippingDetailsDto.getFName());

        shippingDetails.setAddress(ShippingDetailsDto.getAddress());
        shippingDetails.setCity(ShippingDetailsDto.getCity());
        shippingDetails.setProvince(ShippingDetailsDto.getProvince());
        shippingDetails.setZip(ShippingDetailsDto.getZip());
        shippingDetails.setPhone(ShippingDetailsDto.getPhone());

        return ResponseEntity.status(201).body(this.shippingDetailsRepository.save(shippingDetails));
    }
}
