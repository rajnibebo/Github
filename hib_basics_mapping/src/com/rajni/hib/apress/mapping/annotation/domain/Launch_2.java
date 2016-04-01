/**
 * 
 */
package com.rajni.hib.apress.mapping.annotation.domain;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

/**
 * @author rajni.ubhi
 *
 */
public class Launch_2 {

	private static SessionFactory sessionFactory = null;
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Session session = getSession();
		List<BookCh2> list = session.createQuery("from bkCh2").list();
		for(BookCh2 book : list) {
			System.out.println(book);
		}
	}
	
	public static Session getSession() {
		if(sessionFactory == null) {
			sessionFactory = new Configuration().configure().buildSessionFactory();
		}
		return sessionFactory.openSession();
	}

}
