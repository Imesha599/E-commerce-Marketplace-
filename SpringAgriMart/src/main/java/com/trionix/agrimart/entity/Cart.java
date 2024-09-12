package com.trionix.agrimart.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Cart {
    @Id
    private String cardId;
    private String productId;
    private String quantity;
    private String totalPrice;
}
