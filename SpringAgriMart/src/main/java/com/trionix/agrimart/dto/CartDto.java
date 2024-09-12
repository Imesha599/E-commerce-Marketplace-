package com.trionix.agrimart.dto;
import lombok.Data;

@Data
public class CartDto {
    private String cardId;
    private String productId;
    private String quantity;
    private String totalPrice;
}
