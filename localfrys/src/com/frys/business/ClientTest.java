/**
 * 
 */
package com.frys.business;

import java.rmi.RemoteException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.util.Date;

import javax.ejb.CreateException;
import javax.ejb.FinderException;
import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;

import com.Outpost.Business.Ssb.ProcessShopListHome;
import com.Outpost.Business.Ssb.ProcessShopListRemote;
import com.Outpost.Entity.AccountHome;
import com.Outpost.Entity.AccountRemote;
import com.frys.common.logger.Log;

/**
 * @author rajni.ubhi
 *
 */
public class ClientTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Log("com.frys.business").info("This is the first message from java class");
	}

	public static String test() {
		new Log("com.frys.business").info("This is the first message from java class");
		try {
			Context ctx = new InitialContext();
			Object obj = ctx.lookup("com.Outpost.Business.Ssb.ProcessShopList");
			ProcessShopListHome home = (ProcessShopListHome) obj;
			ProcessShopListRemote remote = home.create();
			remote.parseOrder();
			System.out.println("After parse order...");
			
			Object obj1 = ctx.lookup("com.Outpost.Entity.Account");
			AccountHome actHome = (AccountHome) obj1;
			AccountRemote actRemote = actHome.create(new Long(6),new Long(103), new Long(0),new Long(3),new Timestamp(new Date().getTime()));
			System.out.println(actRemote.getAccountId()+" created..");
			
			/*actRemote = actHome.findByPrimaryKey(new Long(1));
			System.out.println(actRemote.getPrimaryKey()+" "+actRemote.getUserOwnerId()+" "+actRemote.getStoreId()+" ");
			
			actRemote = actHome.findByPrimaryKey(new Long(2));
			System.out.println(actRemote.getPrimaryKey()+" "+actRemote.getUserOwnerId());
			*/
			actRemote = actHome.findByPrimaryKey(new Long(5));
			System.out.println(actRemote.getPrimaryKey()+" "+actRemote.getUserOwnerId());
			
		} catch (NamingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (RemoteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (CreateException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (FinderException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch(Exception e) {
			e.printStackTrace();
		}

		System.out.println("Check into database : ");
		checkInsertedValue();
		return "Test method executed ... Pls check logs....";
	}
	
	public static void checkInsertedValue() {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/webd","root","root");
			PreparedStatement pstm = con.prepareStatement("select * from account");
			ResultSet rst = pstm.executeQuery();
			while(rst.next()) {
				System.out.println("Record found");
				
				System.out.println(rst.getInt(1));
			}
			System.out.println("No Record Found");
		} catch (SQLException | ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
