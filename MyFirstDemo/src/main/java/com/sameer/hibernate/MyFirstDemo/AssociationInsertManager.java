package com.sameer.hibernate.MyFirstDemo;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.sameer.hibernate.model.Address;
import com.sameer.hibernate.model.Course;
import com.sameer.hibernate.model.Customer;
import com.sameer.hibernate.model.MyCustomer;
import com.sameer.hibernate.model.Request;
import com.sameer.hibernate.model.Student1;
import com.sameer.hibernate.util.HibernateUtil;

public class AssociationInsertManager {

	public static void main(String[] args) {
		
		Transaction transaction = null;
		try {
			SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
			Session session = sessionFactory.openSession();
			transaction = session.beginTransaction();
			
			/*Address address = new Address("HTM", "Blore", "KA");
			MyCustomer mycustomer = new MyCustomer("aa_first", "aa_last", "aa@gmail.com", "1111");
			mycustomer.setAddress(address);
			session.save(mycustomer);*/
			
			/*MyCustomer mycustomer = new MyCustomer("aa", "Kumar", "aa@gmail.com", "2222");
			Request request1 = new Request("22/07/2014", "hello1", "ok1");
			Request request2 = new Request("23/07/2014", "hello2", "ok2");
			
			request1.setMyCustomer(mycustomer);
			request2.setMyCustomer(mycustomer);
			session.save(mycustomer);
			
			session.save(request1);
			session.save(request2);*/
			
			Student1 stu1 = new Student1("aa", "aa@volvo", 1111);
			Student1 stu2 = new Student1("bb", "bb@volvo", 2222);
			Student1 stu3 = new Student1("cc", "cc@volvo", 3333);
			session.save(stu1);
			session.save(stu2);
			session.save(stu3);
			
			Course cou1 = new Course("Java", new Integer(6), new Double(999));
			Course cou2 = new Course("Spring", new Integer(3), new Double(777));
			Course cou3 = new Course("Hibernate", new Integer(2), new Double(666));
			session.save(cou1);
			session.save(cou2);
			session.save(cou3);
			
			Set<Course> setCourse = new HashSet<Course>();
			setCourse.add(cou1);
			setCourse.add(cou2);
			setCourse.add(cou3);
			
			stu1.setCourses(setCourse);
			
			Set<Course> setCourse2 = new HashSet<Course>();
			setCourse2.add(cou1);
			setCourse2.add(cou2);
			setCourse2.add(cou3);
			
			stu2.setCourses(setCourse2);
			
			transaction.commit();
			session.close();
		}catch(Exception e ) {
			e.printStackTrace();
			if(transaction!=null)
				transaction.rollback();
		}
	}
}
