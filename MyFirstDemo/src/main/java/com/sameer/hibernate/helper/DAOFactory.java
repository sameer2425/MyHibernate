package com.sameer.hibernate.helper;

public class DAOFactory {

	static CustomerDAO customerDAO ; 
	static {
		customerDAO = new HibernateCustomerDAO();
	}
	public static CustomerDAO getCustomerDAO() {
		return customerDAO;
	}
}
