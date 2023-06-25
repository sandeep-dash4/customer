package com.customers;
/*
import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

import com.customers.controller.CustomerController;
import com.customers.model.Customer;
import com.customers.repository.CustomerRepository;
import com.customers.service.CustomerService;

//import org.junit.jupiter.api.Test;
//import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class CustomersApplicationTests {
	
	
	@Mock
    CustomerRepository customerRepository;

	@InjectMocks
	CustomerService customerService;
	
	@Test
	public void whenValidName_thenEmployeeShouldBeFound() {
		Customer customer = new Customer();
		customer.setId("1");
		customer.setName("C1");
		customer.setOrderId("111");
	    String name = "C1";
	    when(customerRepository.createCustomer()).thenReturn(customer);
	    Customer customerNew = customerService.getCustomerDetails();
	 
	     assertThat(customer.getName())
	      .isEqualTo(name);
	 }

}*/
