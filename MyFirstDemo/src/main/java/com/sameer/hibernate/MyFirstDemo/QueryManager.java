package com.sameer.hibernate.MyFirstDemo;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.criterion.Criterion;
import org.hibernate.criterion.Restrictions;

import com.sameer.hibernate.model.Customer;
import com.sameer.hibernate.util.HibernateUtil;

public class QueryManager {
	public static void main(String[] args) {
		Transaction tx = null;
		try {
			SessionFactory sf = HibernateUtil.getSessionFactory();
			Session session = sf.openSession();
			tx = session.beginTransaction();

			/*Criteria criteria = session.createCriteria(Customer.class);
			criteria.add(Restrictions.eq("city", "Blore"));
			List<Customer> list = criteria.list();
			System.out.println(list);*/
			
			/*String hql = "from Customer cust";
			Query query = session.createQuery(hql);
			List<Customer>listCust = query.list();
			for(Customer cust : listCust) {
				System.out.println(cust);
			}*/
			
			Criteria criteria = session.createCriteria(Customer.class);
			criteria.add(Restrictions.in("city", new String[] {"Pune","Blore"}) );
			
			List<Customer> cust = criteria.list();
			for(Customer c: cust) {
				System.out.println(c);
			}
			
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
