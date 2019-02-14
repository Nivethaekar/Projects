package com.ford.service;

import java.util.List;

import com.ford.model.Customer;
import com.ford.repository.CustomerRepositoryImpl;
import com.ford.repository.ICustomerRepository;

public class CustomerServiceImpl implements CustomerService {

	private ICustomerRepository customerRepository = new CustomerRepositoryImpl();
	
	/* (non-Javadoc)
	 * @see com.ford.service.CustomerService#findAll()
	 */
	@Override
	public List<Customer> findAll(){
		return customerRepository.findAll();
	}
}
