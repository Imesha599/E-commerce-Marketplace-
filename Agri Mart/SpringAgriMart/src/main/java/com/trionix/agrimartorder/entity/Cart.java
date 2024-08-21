package com.trionix.agrimartorder.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Cart {
    @Id
    private String cardId;

    @DBRef()
    private Product product;

    private double quantity;

    private double totalPrice;
}
