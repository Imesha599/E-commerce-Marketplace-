package com.trionix.agrimartorder.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;

import java.time.LocalDateTime;


@Data
@NoArgsConstructor
@AllArgsConstructor
public class Order {
    @Id
    private String orderId;
    private LocalDateTime orderDateTime;
    private String productTitle;
    private Double quantity;
    private Double amount;
}
