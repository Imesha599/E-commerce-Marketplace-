package com.trionix.agrimartorder.service.impl;

import com.trionix.agrimartorder.dto.NewOrderDto;
import com.trionix.agrimartorder.entity.Order;
import com.trionix.agrimartorder.repository.OrderRepository;
import com.trionix.agrimartorder.service.OrderService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.time.LocalDateTime;
import java.util.List;

@Service
@RequiredArgsConstructor

public class OrderServiceImpl implements OrderService {
    private final OrderRepository orderRepository;

    @Override
    public Order addOrder(NewOrderDto orderDto) {
        Order order = new Order();

        order.setOrderDateTime(LocalDateTime.now());
        order.setProductTitle(orderDto.getProductTitle());
        order.setQuantity(orderDto.getQuantity());
        order.setAmount(orderDto.getAmount());
        return orderRepository.save(order);
    }


    @Override
    public void delete(String id) {
        orderRepository.deleteById(id);
    }

    @Override
    public Order findOne(String id) {
        var x = orderRepository.findById(id);
        if(x.isEmpty())
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Cannot find order");
        return x.get();
    }

    @Override
    public List<Order> findAll() {
        return orderRepository.findAll();
    }
}
