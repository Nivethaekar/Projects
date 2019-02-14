package com.ford.repository;

import java.util.List;

import com.ford.model.Customer;

public interface ICustomerRepository {

	List<Customer> findAll();

}