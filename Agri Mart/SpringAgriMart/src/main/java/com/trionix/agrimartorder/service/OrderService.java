package com.trionix.agrimartorder.service;

import com.trionix.agrimartorder.dto.NewOrderDto;
import com.trionix.agrimartorder.entity.Order;

import java.util.List;
public interface OrderService {
    Order addOrder(NewOrderDto orderDto);


    void delete(String id);

    Order findOne(String id);

    List<Order> findAll();
}
