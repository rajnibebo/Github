/**
 * 
 */
package com.rajni.hibernate.basics;

import javax.persistence.EntityManager;
import javax.persistence.Persistence;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.AnnotationConfiguration;

/**
 * @author rajni.ubhi
 *
 */
public class SessionManager {
	
	private static final SessionFactory sessionFactory = buildSessionFactory();
	
	private static SessionFactory buildSessionFactory() {
		return new AnnotationConfiguration().configure().buildSessionFactory();
	}
	
	public static SessionFactory getSessionFactory() {
		return sessionFactory;
	}
	
	public static EntityManager getEntityManager() {
		return Persistence.createEntityManagerFactory("book1").createEntityManager();
	}
}
