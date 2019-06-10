package com.sameer.hibernate.MyFirstDemo;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.sameer.hibernate.model.Student;
import com.sameer.hibernate.util.HibernateUtil;

public class CollectionInsertManager {

	public static void main(String[] args) {

		Transaction transaction = null;
		try {
			SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
			Session session = sessionFactory.openSession();
			transaction = session.beginTransaction();
			
			String[] courses = {"Java","JDBC","JSP"};
			
			List<String>emails = new ArrayList<String>();
			emails.add("aa@gmail.com");
			emails.add("bb@gmail.com");
			emails.add("cc@gmail.com");
			
			List<Integer> marks = new ArrayList<Integer>();
			marks.add(new Integer(100));
			marks.add(new Integer(90));
			marks.add(new Integer(100));
			
			Set<Long> phone = new HashSet<Long>();
			phone.add(new Long(1111));
			phone.add(new Long(2222));
			phone.add(new Long(3333));
			
			Map<String, Long> refs = new HashMap<String, Long>();
			refs.put("aa", new Long(1111));
			refs.put("bb", new Long(2222));
			refs.put("cc", new Long(3333));
			
			Student student = new Student("sri", "10-10-10", "BE", courses, emails, marks, phone, refs);
			session.save(student);
			
			transaction.commit();
			session.close();
			System.out.println("Done");
		} catch (Exception e) {
			e.printStackTrace();
			if (transaction != null)
				transaction.rollback();
		}
	}
}
