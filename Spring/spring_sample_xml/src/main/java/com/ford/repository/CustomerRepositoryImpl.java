package com.ford.repository;

import java.util.ArrayList;
import java.util.List;

import com.ford.model.Customer;

public class CustomerRepositoryImpl implements ICustomerRepository {

	/* (non-Javadoc)
	 * @see com.ford.repository.ICustomerRepository#findAll()
	 */
	@Override
	public List<Customer> findAll() {
		List<Customer> customers = new ArrayList<Customer>();
		Customer customer = new Customer();
		customer.setFirstname("Kaps");
		customer.setLastname("ekar");
		customers.add(customer);
		return customers;
	}
}
