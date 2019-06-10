package com.sameer.hibernate.helper;

import com.sameer.hibernate.dto.CustomerDTO;
import com.sameer.hibernate.model.Customer;
import com.sameer.hibernate.util.HibernateTemplate;

public class HibernateCustomerDAO implements CustomerDAO {

	public int addCustomer(CustomerDTO customerDTO) {
		Customer customer = new Customer(customerDTO.getCname(), customerDTO.getEmail(), customerDTO.getPhone(), customerDTO.getCity(), customerDTO.getState());
		Integer it = (Integer) HibernateTemplate.saveObject(customer);
		return it.intValue();
	}

	public void updateCustomer(CustomerDTO customerDTO) {
		Customer customer = new Customer(customerDTO.getCname(), customerDTO.getEmail(), customerDTO.getPhone(), customerDTO.getCity(), customerDTO.getState());
		HibernateTemplate.updateObject(customer);
	}

	public void deleteCustomer(int cid) {
		HibernateTemplate.deleteObject(Customer.class, cid);

	}

	public CustomerDTO getCustomerByCid(int cid) {
		Customer cust = (Customer) HibernateTemplate.loadObject(Customer.class, cid);
		CustomerDTO customerDTO = new CustomerDTO(cust.getCid(), cust.getCname(), cust.getEmail(), cust.getPhone(), cust.getCity(), cust.getState());
		return customerDTO;
	}
}
