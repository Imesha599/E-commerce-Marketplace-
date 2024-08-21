package com.trionix.agrimartorder.dto;

import org.springframework.web.bind.annotation.*;

public class AdminDto {
    @GetMapping("/getadmin")
    public String getAllAdmin(){
        return "getAllAdmin";
    }
    @GetMapping("/getadmin/{id}")
    public String getOneAdmin(@PathVariable String id){
        System.out.println(id);
        return "getOneAdmin";
    }
    @DeleteMapping("/deleteadmin/{id}")
    public String deleteAdmin(@PathVariable String id){
        System.out.println(id);
        return "deleteAdmin";
    }
    @PutMapping("/putadmin/{id}")
    public String updateAdmin(@RequestBody NewCustomerDto body, @PathVariable String id){
        System.out.println(body);
        return "updateAdmin";
    }
}
