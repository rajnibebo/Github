/**
 * 
 */
package com.frys.business;

import java.rmi.RemoteException;

import javax.ejb.CreateException;
import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;

import com.Outpost.Business.Ssb.ProcessShopListHome;
import com.Outpost.Business.Ssb.ProcessShopListRemote;
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
			
		} catch (NamingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (RemoteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (CreateException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return "Test method executed ... Pls check logs....";
	}
}
