/**
 * 
 */
package com.rajni.spring.jdbc.dao.plain;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.rajni.spring.jdbc.dao.ContactDao;
import com.rajni.spring.jdbc.domain.Contact;

/**
 * @author rajni.ubhi
 *
 */
public class PlainContactDao implements ContactDao {

	static {
		try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	private Connection getConnection() throws SQLException {
		return DriverManager.getConnection("jdbc:mysql://localhost:3306/spring_jdbc", "root", "root");
	}
	
	private void closeConnection(Connection con) {
		if(con != null) {
			try {
				con.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}
	
	/** (non-Javadoc)
	 * @see com.rajni.spring.jdbc.dao.ContactDao#findAll()
	 */
	@Override
	public List<Contact> findAll() {
		// TODO Auto-generated method stub
		List<Contact> contactList = new ArrayList<Contact>();
		Connection con = null;
		try {
			con = getConnection();
			PreparedStatement pstm = con.prepareStatement("select * from CONTACT");
			ResultSet rst = pstm.executeQuery();
			while(rst.next()) {
				Contact contact = new Contact();
				contact.setId(rst.getLong("ID"));
				contact.setFirstName(rst.getString("FIRST_NAME"));
				contact.setLastName(rst.getString("LAST_NAME"));
				contact.setBirthDate(rst.getDate("BIRTH_DATE"));
				contactList.add(contact);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally{
			closeConnection(con);
		}
		
		return contactList;
	}

	/** (non-Javadoc)
	 * @see com.rajni.spring.jdbc.dao.ContactDao#findByFirstName(java.lang.String)
	 */
	@Override
	public List<Contact> findByFirstName(String firstName) {
		// TODO Auto-generated method stub
		return null;
	}

	/* (non-Javadoc)
	 * @see com.rajni.spring.jdbc.dao.ContactDao#insert(com.rajni.spring.jdbc.domain.Contact)
	 */
	@Override
	public void insert(Contact contact) {
		// TODO Auto-generated method stub
		Connection connection = null;
		try {
			connection = getConnection();
			PreparedStatement statement = connection .prepareStatement(
							"insert into Contact (first_name, last_name, birth_date) values (?, ?, ?)",
							Statement.RETURN_GENERATED_KEYS);
			statement.setString(1, contact.getFirstName());
			statement.setString(2, contact.getLastName());
			statement.setDate(3, contact.getBirthDate());
			statement.execute();
			ResultSet generatedKeys = statement.getGeneratedKeys();
			if (generatedKeys.next()) {
				contact.setId(generatedKeys.getLong(1));
			}
		} catch (SQLException ex) {
			ex.printStackTrace();
		} finally {
			closeConnection(connection);
		}
	}

	/* (non-Javadoc)
	 * @see com.rajni.spring.jdbc.dao.ContactDao#update(com.rajni.spring.jdbc.domain.Contact)
	 */
	@Override
	public void update(Contact contact) {
		// TODO Auto-generated method stub

	}

	/* (non-Javadoc)
	 * @see com.rajni.spring.jdbc.dao.ContactDao#delete(com.rajni.spring.jdbc.domain.Contact)
	 */
	@Override
	public void delete(Long contactId) {
		// TODO Auto-generated method stub
		Connection connection = null;
		try {
			connection = getConnection();
			PreparedStatement statement = connection.prepareStatement("delete from contact where id=?");
			statement.setLong(1, contactId);
			statement.execute();
		} catch (SQLException ex) {
			ex.printStackTrace();
		} finally {
			closeConnection(connection);
		}
	}

}
