package com.trionix.agrimartorder.controller;


import com.trionix.agrimartorder.entity.DeliveryDetails;
import com.trionix.agrimartorder.repository.DeliveryDetailsRepository;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@CrossOrigin(origins = "http://localhost:3000")
public class DeliveryDetailsController {
    private final DeliveryDetailsRepository deliveryDetailsRepository;

    public DeliveryDetailsController(DeliveryDetailsRepository  deliveryDetailsRepository) {
        this.deliveryDetailsRepository = deliveryDetailsRepository;
    }

    @PostMapping("/Details")
    public ResponseEntity<DeliveryDetails> createDeliveryDetails(@RequestBody DeliveryDetails DeliveryDetailsDto) {
        DeliveryDetails deliveryDetails = new DeliveryDetails ();
        deliveryDetails.setOrderId(DeliveryDetailsDto.getOrderId());
        deliveryDetails.setCustomerId(DeliveryDetailsDto.getCustomerId());
        deliveryDetails.setSellerId(DeliveryDetailsDto.getSellerId());
        deliveryDetails.setShippingAddress(DeliveryDetailsDto.getShippingAddress());
        deliveryDetails.setTotalAmount(DeliveryDetailsDto.getTotalAmount());
        deliveryDetails.setPaymentType(DeliveryDetailsDto.getPaymentType());
        deliveryDetails.setDateOfOrder(DeliveryDetailsDto.getDateOfOrder());
        deliveryDetails.setEstimatedDeTime(DeliveryDetailsDto.getEstimatedDeTime());
        deliveryDetails.setDeliveryStatus(DeliveryDetailsDto.getDeliveryStatus());

        return ResponseEntity.status(200).body(this.deliveryDetailsRepository.save(deliveryDetails));

    }

    @GetMapping("/deliveryDetails")
    public ResponseEntity<List<DeliveryDetails>> getAllDeliveryDetails() {
        return ResponseEntity.ok(this.deliveryDetailsRepository.findAll());

    }

    @GetMapping("/deliveryDetails/{id}")
    public ResponseEntity getDeliveryDetails(@PathVariable String id) {
        Optional <DeliveryDetails>deliveryDetails=this.deliveryDetailsRepository.findById(id);
        if(deliveryDetails.isPresent()){
            return ResponseEntity.ok(deliveryDetails.get());
        }
        else{
            return ResponseEntity.ok("This delivery is not found");
        }

    }

    @PutMapping("/deliveryDetails/{id}")
    public ResponseEntity updateDelivery(@PathVariable String id,@RequestBody DeliveryDetails DeliveryDetailsDto){
        Optional<DeliveryDetails> deliveryData=this.deliveryDetailsRepository.findById(id);
        if (deliveryData.isPresent()) {
            DeliveryDetails deliveryDetails = deliveryData.get();

            deliveryDetails.setDeliveryStatus(DeliveryDetailsDto.getDeliveryStatus());
            return new ResponseEntity<>(deliveryDetailsRepository.save(deliveryDetails), HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);



        }
    }
}
