package com.customers.repository;

import org.springframework.stereotype.Repository;

import com.customers.model.Customer;

@Repository
public class CustomerRepository {
	
	public Customer createCustomer() {
		Customer customer = new Customer();
		customer.setId("1");
		customer.setName("C1");
		customer.setOrderId("111");
		return customer;

	}


}
