package com.trionix.agrimartorder.dto;

import lombok.Data;

@Data  //getters and setters
public class NewShippingAddressDto {
    private String firstName;
    private String lastName;
    private Long phoneNumber;
    private String email;
    private String fullAddress;
    private String city;
    private String province;
    private int zipCode;

}
