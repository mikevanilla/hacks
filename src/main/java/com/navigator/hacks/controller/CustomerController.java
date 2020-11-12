package com.navigator.hacks.controller;

import com.navigator.hacks.exception.InvalidCustomerReference;
import com.navigator.hacks.model.Customer;
import com.navigator.hacks.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;
import java.util.Optional;

@RestController
public class CustomerController {

    @Autowired
    CustomerService customerService;

    @GetMapping("/customers")
    public Collection<Customer> getAllCustomers() {
        return this.customerService.getCustomers();
    }

    @GetMapping("/customer/{id}")
    public Customer getCustomerById(@PathVariable("id") Long id) {
        Optional<Customer> customer = this.customerService.getCustomer(id);
        if(customer.isPresent()) {
            return customer.get();
        }
        throw new InvalidCustomerReference("Invalid customer reference provided");
    }

    @PostMapping("/customer")
    public Long createTransaction(@RequestBody Customer customer) {
        this.customerService.saveCustomer(customer);
        return customer.getId();
    }
}
