package com.sameer.hibernate.MyFirstDemo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.sameer.hibernate.model.CurrentStudents;
import com.sameer.hibernate.model.MyStudent;
import com.sameer.hibernate.model.OldStudents;
import com.sameer.hibernate.model.WeekdaysStudents;
import com.sameer.hibernate.model.WeekendStudents;
import com.sameer.hibernate.util.HibernateUtil;

public class InheritanceInsertManager {

	public static void main(String[] args) {
		
		Transaction transaction = null;
		try {
			SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
			Session session = sessionFactory.openSession();
			transaction = session.beginTransaction();
			
			/*MyStudent myStudent = new MyStudent("kabir", "Blore", "Enabled", 15000.0);
			Integer it = (Integer) session.save(myStudent);
			System.out.println(it.intValue());*/
			
			/*CurrentStudents currentStudents = new CurrentStudents("sri", "Blore", "Enabled", 15000.0, 2000.0, "6:10AM", "BTM");
			Integer it = (Integer) session.save(currentStudents);
			System.out.println(it);*/
			
			/*OldStudents oldStudents = new OldStudents("aa", "Hyd", "Enabled", 15000.0, "Volvo", "aa@volvo", 9.0);
			Integer it = (Integer)session.save(oldStudents);
			System.out.println(it);*/
			
			/*WeekdaysStudents weekdaysStudents = new WeekdaysStudents("bb", "Hyd", "Enabled", 15000.0, 2000.0, "8:30AM", "BTM", "BE", "80", 2012);
			Integer it = (Integer)session.save(weekdaysStudents);
			System.out.println(it);*/
			
			/*WeekendStudents weekendStudents = new WeekendStudents("cc", "Pune", "Enable", 3000.0, 2000.0, "10AM", "Marathalli", "Volvo", "cc@volvo", 200.0);
			Integer it = (Integer)session.save(weekendStudents);
			System.out.println(it);*/
			
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
