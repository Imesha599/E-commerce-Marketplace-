package com.trionix.agrimart.controller;

import com.trionix.agrimart.dto.NewFarmerDto;
import org.springframework.web.bind.annotation.*;

@RestController
public class FarmerController {
    @PostMapping("/farmers")
    public String createFarmer(@RequestBody NewFarmerDto body){
        System.out.println(body);
        return "Post All Farmers";
    }
    @GetMapping("/farmers")
    public String getAllFarmer(){
        return "getAllFarmer";
    }

    @GetMapping("/farmers/{id}")
    public String getOneFarmer(@PathVariable String id){
        System.out.println(id);
        return "getOneFarmer";
    }
    @DeleteMapping("/farmers/{id}")
    public String deleteFarmer(@PathVariable String id){
        System.out.println(id);
        return "deleteFarmer";
    }
    @PutMapping("/farmers/{id}")
    public String updateFarmer(@RequestBody NewFarmerDto body, @PathVariable String id){
        System.out.println(body);
        return "updateFarmer";
    }
}
