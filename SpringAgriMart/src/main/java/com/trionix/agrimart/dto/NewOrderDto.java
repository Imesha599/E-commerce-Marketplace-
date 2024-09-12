package com.trionix.agrimart.dto;

import lombok.Data;

import java.time.LocalDateTime;

@Data
public class NewOrderDto {
    private String orderId;
    private LocalDateTime orderDateTime;
}
