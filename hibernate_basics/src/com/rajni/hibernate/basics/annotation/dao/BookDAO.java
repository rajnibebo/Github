/**
 * 
 */
package com.rajni.hibernate.basics.annotation.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.Query;

import org.hibernate.Session;

import com.rajni.hibernate.basics.SessionManager;
import com.rajni.hibernate.basics.annotation.domain.Book;

/**
 * @author rajni.ubhi
 *
 */
public class BookDAO {
	public static List<Book> readall() {
		Session session = SessionManager.getSessionFactory().getCurrentSession();
		session.beginTransaction();
		
		List<Book> bookList = session.createQuery("from Book").list();
		session.getTransaction().commit();
		return bookList;
	}
	
	public void create(Book bookObj) {
		Session session = SessionManager.getSessionFactory().getCurrentSession();
		session.beginTransaction();
		session.saveOrUpdate(bookObj);
		session.getTransaction().commit();
	}
	
	public static List<Book> readFromManager() {
		EntityManager entityManager = SessionManager.getEntityManager();
		EntityTransaction transaction = entityManager.getTransaction();
		transaction.begin();
		Query query = entityManager.createQuery("select b from Book b");
		List<Book> list = query.getResultList();
		transaction.commit();
		entityManager.close();
		return list;
	}
	
	public static void main(String[] args) {
		System.out.println(readFromManager());
	}
}
