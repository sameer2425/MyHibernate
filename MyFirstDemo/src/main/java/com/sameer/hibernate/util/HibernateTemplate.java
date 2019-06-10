package com.sameer.hibernate.util;

import java.io.Serializable;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class HibernateTemplate {

	public static Object saveObject(Object obj) {
		
		Object ob = null ;
		Transaction transaction = null;
		try {
			SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
			Session session = sessionFactory.openSession();
			transaction = session.beginTransaction();
			ob = session.save(obj);
			transaction.commit();
			session.close();
		}catch (Exception e) {
			e.printStackTrace();
		}
		return ob;
	}
	
	public static void updateObject(Object obj) {
		
		Transaction transaction = null;
		try {
			SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
			Session session = sessionFactory.openSession();
			transaction = session.beginTransaction();
			session.update(obj);
			transaction.commit();
			session.close();
		}catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void deleteObject(Class cls, Serializable s) {
		Transaction transaction = null;
		try {
			SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
			Session session = sessionFactory.openSession();
			transaction = session.beginTransaction();
			Object ob = session.load(cls,s);
			session.delete(ob);
			transaction.commit();
			session.close();
		}catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public static Object loadObject(Class cls, Serializable s) {
		Transaction transaction = null;
		Object ob = null ;
		try {
			SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
			Session session = sessionFactory.openSession();
			transaction = session.beginTransaction();
			ob = session.load(cls,s);
	   		transaction.commit();
			session.close();
		}catch (Exception e) {
			e.printStackTrace();
		}
		return ob;
	}
}
