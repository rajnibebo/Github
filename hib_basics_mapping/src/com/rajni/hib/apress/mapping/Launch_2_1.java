package com.rajni.hib.apress.mapping;

import java.util.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.stat.Statistics;

public class Launch_2_1 {
	
	private static SessionFactory sessionFactory;
	
	public static Session getSession() {
		if(sessionFactory == null) {
			sessionFactory = new Configuration().configure().buildSessionFactory();
		}
		return sessionFactory.openSession();
	}
	public static void main(String[] args) {
		
	}
	
	public static void saveBook() {
		Session session = getSession();
		Statistics statistics = sessionFactory.getStatistics();
		statistics.setStatisticsEnabled(true);
		Transaction tx = session.beginTransaction();
		for(int i = 0 ; i < 3; i++) {
			BookCh2 book = new BookCh2();
			book.setBookName("Hibernate "+(i+1));
			book.setPrice(120);
			book.setPublishDate(new Date());
			session.save(book);
		}
		tx.commit();
		System.out.println(statistics.getSessionOpenCount());
		statistics.logSummary();
		session.close();
	}
	
	public static void getCustomer() {
		Session session = getSession();
		Statistics statistics = sessionFactory.getStatistics();
		statistics.setStatisticsEnabled(true);
		Customer customer = new Customer();
		/*customer.setCountryCode("mo");
		customer.setIdCardNo("1234567(8)");*/
		Customer cust = (Customer) session.get(Customer.class, customer);
		System.out.println(cust);
		System.out.println(statistics.getSessionOpenCount());
		statistics.logSummary();
		session.close();
	}
	
	public static void getCustomer1() {
		Session session = getSession();
		Statistics statistics = sessionFactory.getStatistics();
		statistics.setStatisticsEnabled(true);
		Customer customer = new Customer();
		/*customer.setCountryCode("mo");
		customer.setIdCardNo("1234567(8)");*/
		Customer cust = (Customer) session.get(Customer.class, customer);
		System.out.println(cust);
		System.out.println(statistics.getSessionOpenCount());
		statistics.logSummary();
		session.close();
	}
}
