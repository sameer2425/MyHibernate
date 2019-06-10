package com.sameer.hibernate.helper;

import com.sameer.hibernate.dto.CustomerDTO;

public interface CustomerDAO {

	public int addCustomer(CustomerDTO customerDTO);
	public void updateCustomer(CustomerDTO customerDTO);
	public void deleteCustomer(int cid);
	public CustomerDTO getCustomerByCid(int cid);
}
