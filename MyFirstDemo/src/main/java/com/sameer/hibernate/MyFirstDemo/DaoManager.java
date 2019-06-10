package com.sameer.hibernate.MyFirstDemo;

import com.sameer.hibernate.dto.CustomerDTO;
import com.sameer.hibernate.helper.CustomerDAO;
import com.sameer.hibernate.helper.DAOFactory;

public class DaoManager {

	public static void main(String[] args) {
		
		CustomerDAO customerDAO  = DAOFactory.getCustomerDAO();
		
		//Add Customer
		/*CustomerDTO customerDTO = new CustomerDTO("aa","aa@gmail.com",1111,"Blore","KA"); 
		customerDAO.addCustomer(customerDTO);*/
		
		//Get Customer
		/*CustomerDTO customerDTO = customerDAO.getCustomerByCid(1);
		System.out.println(customerDTO.getCid()+"\t"+customerDTO.getCname()+"\t"+ customerDTO.getEmail()+"\t"+ customerDTO.getPhone()+"\t"+ customerDTO.getCity()+"\t"+ customerDTO.getState());*/
	
		//Delete Customer
		//customerDAO.deleteCustomer(3);
		
		//Update Customer
		CustomerDTO customerDTO = customerDAO.getCustomerByCid(2);
		customerDTO.setCname("cc");
		customerDTO.setCity("Hyd");
		customerDAO.updateCustomer(customerDTO);
	}
	
}
