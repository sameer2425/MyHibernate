package com.sameer.hibernate.MyFirstDemo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.sameer.hibernate.model.Customer;
import com.sameer.hibernate.util.HibernateUtil;

public class LoadManager {

	public static void main(String[] args) {
		Transaction transaction = null ;
		try {
			SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
			Session session = sessionFactory.openSession();
			transaction = session.beginTransaction();
			Customer customer = (Customer) session.load(Customer.class, 1);
			System.out.println(customer.getCid()+"\t"+customer.getCname()+"\t"+customer.getEmail()+"\t"+customer.getEmail()+"\t"+customer.getPhone()+"\t"+customer.getCity());
			/*customer.setCity("Pune");
			session.update(customer);*/
			transaction.commit();
			session.close();
			
		}catch(Exception e) {
			e.printStackTrace();
			if(transaction!=null) {
				transaction.rollback();
			}
		}
	}
}
