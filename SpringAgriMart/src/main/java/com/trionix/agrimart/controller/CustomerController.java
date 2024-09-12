package com.trionix.agrimart.controller;

import com.example.trionix.agrimart.dto.NewCustomerDto;
import com.example.trionix.agrimart.entity.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import com.example.trionix.agrimart.repository.CustomerRespository;

@Document("Customers")

@RestController
public class CustomerController {
   @Autowired
    private final CustomerRespository customerRepository;

    public CustomerController(CustomerRespository customerRepository) {
        this.customerRepository = customerRepository;
    }

    @PostMapping("/customers")
    public ResponseEntity<Customer> createCustomers(@RequestBody Customer NewCustomerDto) {
        Customer customer =new Customer();
        customer.setFirstName( NewCustomerDto.getFirstName());
        customer.setLastName( NewCustomerDto.getLastName());
        customer.setAge(NewCustomerDto.getAge());
        customer.setPhoneNumber( NewCustomerDto.getPhoneNumber());
        customer.setAddress( NewCustomerDto.getAddress());

        return ResponseEntity.status(201).body(this.customerRepository.save(customer));

    }
    @GetMapping("/customers")
    public String getAllCustomer(){
        return "getAllCustomer";
    }
    @GetMapping("/customers/{id}")
    public String getOneCustomer(@PathVariable String id){
        System.out.println(id);
        return "getOneCustomer";
    }
    @DeleteMapping("/customers/{id}")
    public String deleteCustomer(@PathVariable String id){
        System.out.println(id);
        return "deleteCustomer";
    }
    @PutMapping("/customers/{id}")
    public String updateCustomer(@RequestBody NewCustomerDto body, @PathVariable String id){
        System.out.println(body);
        return "updateCustomer";
    }

}



