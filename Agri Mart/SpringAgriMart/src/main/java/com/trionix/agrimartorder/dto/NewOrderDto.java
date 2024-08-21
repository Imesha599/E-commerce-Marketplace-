package com.trionix.agrimartorder.dto;

import lombok.Data;

import java.time.LocalDateTime;
@Data
public class NewOrderDto {

    private String orderId;
    private LocalDateTime orderDateTime;
    private String productTitle;
    private Double quantity;
    private Double amount;
}
