package com.navigator.hacks.service;

import com.navigator.hacks.model.Customer;
import com.navigator.hacks.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

@Service
public class CustomerService {

    @Autowired
    CustomerRepository customerRepository;

    public List<Customer> getCustomers() {
        return StreamSupport.stream(this.customerRepository.findAll().spliterator(), false).collect(Collectors.toList());
    }

    public Optional<Customer> getCustomer(Long id) {
        return this.customerRepository.findById(id);
    }

    public void saveCustomer(Customer customer) {
        this.customerRepository.save(customer);
    }
}
