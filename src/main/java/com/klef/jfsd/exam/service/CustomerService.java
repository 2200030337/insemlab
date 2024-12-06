package com.klef.jfsd.exam.service;

import com.klef.jfsd.exam.model.Customer;
import com.klef.jfsd.exam.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerService {

    @Autowired
    private CustomerRepository customerRepository;

    // Method to add a new customer
    public void addCustomer(Customer customer) {
        if (customer.getCustomerId() == null) {
            throw new IllegalArgumentException("Customer ID must be provided");
        }
        customerRepository.save(customer);
    }

    // Method to retrieve all customers
    public List<Customer> getAllCustomers() {
        return customerRepository.findAll();
    }
}