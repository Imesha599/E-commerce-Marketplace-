package com.trionix.agrimartorder.controller;

import com.trionix.agrimartorder.dto.NewCustomerDto;
import com.trionix.agrimartorder.entity.Customer;
import com.trionix.agrimartorder.repository.CustomerRepository;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
@RestController

public class CustomerController {
//    @Autowired
    private final CustomerRepository customerRepository;

    public CustomerController(CustomerRepository customerRepository) {
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
