package com.luv2code.springdemo.service;

import java.util.List;

import com.luv2code.springdemo.entity.Customer;

public interface CustomerService {
	
	Customer getCustomer(int theId);
	
	List<Customer> getCustomers();

	void saveCustomer(Customer theCustomer);

	
}
