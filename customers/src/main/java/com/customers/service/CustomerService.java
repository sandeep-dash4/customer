package com.customers.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.customers.model.Customer;
import com.customers.repository.CustomerRepository;

@Service
public class CustomerService {
	
	
	@Autowired
	CustomerRepository customerRepository;

	public Customer getCustomerDetails() {

		return customerRepository.createCustomer();
	}

	// as can't implement the db
	
}
