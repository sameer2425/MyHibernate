package com.sameer.hibernate.MyFirstDemo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.sameer.hibernate.model.Student;
import com.sameer.hibernate.util.HibernateUtil;

public class CollectionLoadManager {

	public static void main(String[] args) {
		
		Transaction transaction = null;
		try {
			SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
			Session session = sessionFactory.openSession();
			transaction = session.beginTransaction();
			
			Student students = (Student) session.load(Student.class, 4);
			System.out.println(students.getSid()+"\t"+students.getSname()+"\t"+students.getDob());
			
			for(String cn : students.getCourses()) {
				System.out.println(cn);
			}
			System.out.println(students.getEmails());
			System.out.println(students.getMarks());
			System.out.println(students.getPhone());
			System.out.println(students.getRefs());
			
			transaction.commit();
			session.close();
		}catch (Exception e) {
			e.printStackTrace();
			if (transaction != null)
				transaction.rollback();
		}
	}
}
