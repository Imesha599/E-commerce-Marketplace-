package com.trionix.agrimart.dto;

import lombok.Data;

@Data
public class NewFarmerDto {
    private String firstName;
    private String lastName;
    private String shopName;
    private String shopId;
    private int mobileNo;
    private String email;
    private String shippingAddress;
    private String bankName;
    private String branchName;
    private int bankAccNo;
}
