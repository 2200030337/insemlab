package com.klef.jfsd.exam.repository;

import com.klef.jfsd.exam.model.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerRepository extends JpaRepository<Customer, Long> {
    // You can define custom queries here if needed
}