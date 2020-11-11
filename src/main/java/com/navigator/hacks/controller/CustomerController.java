package com.navigator.hacks.controller;

import com.navigator.hacks.model.Customer;
import com.navigator.hacks.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collection;

@RestController
public class CustomerController {

    @Autowired
    CustomerService customerService;

    @GetMapping("/customers")
    public Collection<Customer> getAllCustomers() {
        return this.customerService.getCustomers();
    }
}
