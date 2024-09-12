package com.agriMart.demo.controller;
import com.agriMart.demo.dto.DeliveryDto;
import com.agriMart.demo.entity.Delivery;
import com.agriMart.demo.repository.DeliveryRepository;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@CrossOrigin(origins = "http://localhost:3000")
public class DeliveryController {
    private final DeliveryRepository deliveryRepository;

    public DeliveryController(DeliveryRepository deliveryRepository) {
        this.deliveryRepository = deliveryRepository;
    }

    @PostMapping("/delivery")
    public ResponseEntity<Delivery> createDeliveryStatus(@RequestBody Delivery DeliveryDto) {
        Delivery delivery = new Delivery();
        delivery.setOrderId(DeliveryDto.getOrderId());
        delivery.setTrackingNo(DeliveryDto.getTrackingNo());
        delivery.setEstimatedTime(DeliveryDto.getEstimatedTime());
        delivery.setDstatus(DeliveryDto.getDstatus());
        return ResponseEntity.status(200).body(this.deliveryRepository.save(delivery));


    }

    @GetMapping("/delivery")
    public ResponseEntity<List<Delivery>> getAllDelivery() {
        return ResponseEntity.ok(this.deliveryRepository.findAll());

    }


    @GetMapping("/delivery/{id}")
    public ResponseEntity getDelivery(@PathVariable String id) {
      Optional <Delivery>delivery=this.deliveryRepository.findById(id);
      if(delivery.isPresent()){
          return ResponseEntity.ok(delivery.get());
      }
      else{
          return ResponseEntity.ok("This delivery is not found");
      }

    }




    @PutMapping("/delivery/{id}")
   public ResponseEntity updateDelivery(@PathVariable String id,@RequestBody Delivery DeliveryDto){
        Optional<Delivery>deliveryData=this.deliveryRepository.findById(id);
        if (deliveryData.isPresent()) {
            Delivery delivery = deliveryData.get();
            delivery.setDstatus(DeliveryDto.getDstatus());
            return new ResponseEntity<>(deliveryRepository.save(delivery), HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);



    }
    }


}



