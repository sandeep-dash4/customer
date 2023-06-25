package com.customers.controller;

import java.util.Collections;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.oauth2.client.EnableOAuth2Sso;
import org.springframework.context.annotation.Bean;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.security.oauth2.core.user.OAuth2User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//import com.customers.CustomersApplication;
import com.customers.model.Customer;
import com.customers.service.CustomerService;

@SpringBootApplication
@EnableOAuth2Sso
@RestController
public class CustomerController {

	@Autowired
	CustomerService customerService;

	@GetMapping("/customer")
	public Customer getCustomerDetails() {

		Customer customer = customerService.getCustomerDetails();

		return customer;

	}
	
	@Qualifier
	@Bean
	public CustomerService customerService() {
		return customerService;
	}
	
	public static void main(String[] args) {
		SpringApplication.run(CustomerController.class, args);
		
	}

}
