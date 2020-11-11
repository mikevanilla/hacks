package com.navigator.hacks.service;

import com.navigator.hacks.model.Customer;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CustomerService {

    public List<Customer> getCustomers() {
        return new ArrayList<>();
    }

    public Customer getCustomer(int id) {
        return new Customer();
    }
}
