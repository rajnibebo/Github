/**
 * 
 */
package com.rajni.hibernate.basics;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

//import com.rajni.hibernate.basics.beans.Book;

/**
 * @author rajni.ubhi
 *
 */
public class EmbeddedConnTest {
	public static void main(String[] args) {
		/*SessionFactory sf = new Configuration().configure().buildSessionFactory();
		Session session = sf.openSession();
		Book book = (Book) session.load(Book.class, "PBN123");
		System.out.println(book.getName());*/
	
	}
	
	public static void testConn() {
		try {
			Class.forName("org.apache.derby.jdbc.EmbeddedDriver");
			Connection conn = DriverManager.getConnection("jdbc:derby:C:/Users/rajni.ubhi/MyDB", "book", "book");
			System.out.println("Connection created !! "+conn);
			conn.close();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
