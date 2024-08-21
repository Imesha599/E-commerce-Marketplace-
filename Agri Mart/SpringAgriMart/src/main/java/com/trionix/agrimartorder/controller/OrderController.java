package com.trionix.agrimartorder.controller;
import com.trionix.agrimartorder.service.OrderService;
import com.trionix.agrimartorder.dto.NewOrderDto;
import com.trionix.agrimartorder.entity.Order;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor

public class OrderController {
    private final OrderService orderService;


    @PostMapping("/opostorder")
    public ResponseEntity<Order> addNewOrder(@RequestBody NewOrderDto orderDto) {

        var order = orderService.addOrder(orderDto);
        return ResponseEntity.ok(order);
    }

    @GetMapping("/getorder")
    public List<Order> getAllOrders () {
        return orderService.findAll();

    }

    @GetMapping("/getorder/{id}")
    public Order getOneOrder (@PathVariable String id){
        return orderService.findOne(id);
    }

    @DeleteMapping("/deleteorder/{id}")
    public void deleteOrder (@PathVariable String id){
        orderService.delete(id);
    }
}
