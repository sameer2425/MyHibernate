package com.sameer.hibernate.MyFirstDemo;


import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.criterion.Restrictions;

import com.sameer.hibernate.model.Address1;
import com.sameer.hibernate.model.Customer;
import com.sameer.hibernate.model.Customer1;
import com.sameer.hibernate.util.HibernateUtil;

public class InsertManager {

	public static void main(String[] args) {
		Transaction tx = null;
		try {
			SessionFactory sf = HibernateUtil.getSessionFactory();
			Session session = sf.openSession();
			tx = session.beginTransaction();
			//Customer cust = new Customer("cc", "cc@gmail.com", 8976L, "Blore","KA");
			//session.save(cust);
			
			/*Address1 address1 = new Address1("BTM", "Blore");
			Customer1 customer1 = new Customer1("aa", address1); 
			session.save(customer1);*/
			
			tx.commit();
			session.close();
			System.out.println("Done");

		} catch (Exception e) {
			e.printStackTrace();
			if (tx != null)
				tx.rollback();
		}
	}
}
