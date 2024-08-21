package com.trionix.agrimart.dto;

import lombok.Data;

@Data

public class SignupDto {

        private String fullName;
        private String password;
        private String phoneNo;
        private String email;
        private String address;
        private String gender;
}
