package com.trionix.agrimartorder.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;



@Data
@AllArgsConstructor
@NoArgsConstructor
public class NewProductDto {
    private String productTitle;
    private String category;
    private String description;
    private Double quantity;
    private Double price;
}
