package com.sameer.hibernate.MyFirstDemo;

import java.util.Set;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.sameer.hibernate.model.Address;
import com.sameer.hibernate.model.Course;
import com.sameer.hibernate.model.MyCustomer;
import com.sameer.hibernate.model.Request;
import com.sameer.hibernate.model.Student1;
import com.sameer.hibernate.util.HibernateUtil;

public class AssociationLoadManager {

	public static void main(String[] args) {
		
		Transaction transaction = null;
		try {
			SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
			Session session = sessionFactory.openSession();
			transaction = session.beginTransaction();
			
			/*MyCustomer myCustomer = (MyCustomer) session.load(MyCustomer.class, 1);
			System.out.println(myCustomer.getCid()+"\t"+myCustomer.getFirstName()+"\t"+myCustomer.getLastName()+"\t"+myCustomer.getEmail()+"\t"+myCustomer.getPhone());
			
			Address address = myCustomer.getAddress();
			System.out.println(address.getAid()+"\t"+address.getStreet()+"\t"+address.getCity()+"\t"+address.getState());*/
			
			/*Address address = (Address) session.load(Address.class, 2);
			System.out.println(address.getAid()+"\t"+address.getStreet()+"\t"+address.getCity()+"\t"+address.getState());
			
			MyCustomer myCustomer = address.getMyCustomer();
			System.out.println(myCustomer.getCid()+"\t"+myCustomer.getFirstName()+"\t"+myCustomer.getLastName()+"\t"+myCustomer.getEmail()+"\t"+myCustomer.getPhone());*/
			
			/*MyCustomer myCustomer = (MyCustomer) session.load(MyCustomer.class, 1);
			System.out.println(myCustomer);
			Set<Request> requests = myCustomer.getRequests();
			for(Request req : requests){
				System.out.println(req);
			}*/
			
			Student1 student1 = (Student1) session.load(Student1.class, 1);
			System.out.println("Student Info");
			System.out.println(student1);
			System.out.println("Course Info");
			Set<Course> courses = student1.getCourses();
			for(Course cou : courses) {
				System.out.println(cou);
			}
			transaction.commit();
			session.close();
		}catch(Exception e ) {
			e.printStackTrace();
			if(transaction!=null)
				transaction.rollback();
		}
	}
}
