/**
 * 
 */
package com.Outpost.Business.Ssb;

import java.rmi.RemoteException;
import javax.ejb.EJBException;
import javax.ejb.SessionBean;
import javax.ejb.SessionContext;

/**
 * @author rajni.ubhi
 *
 */
public class ProcessShopList implements SessionBean {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public void parseOrder() {
		System.out.println("Inside parse order...");
	}

	 /**
    *
    *
    * @see #ejbCreate()
    * @see #ejbCreate()
    * @throws RemoteException
    */
   public void ejbCreate() throws RemoteException {
	   System.out.println("Inside ejbCreate...");
   }

 
	@Override
	public void ejbActivate() throws EJBException, RemoteException {
		// TODO Auto-generated method stub
		System.out.println("Inside ejbActivate...");
	}

	@Override
	public void ejbPassivate() throws EJBException, RemoteException {
		// TODO Auto-generated method stub
		System.out.println("Inside ejbPassivate...");
	}

	@Override
	public void ejbRemove() throws EJBException, RemoteException {
		// TODO Auto-generated method stub
		System.out.println("Inside ejbRemove...");
	}

	@Override
	public void setSessionContext(SessionContext arg0) throws EJBException,
			RemoteException {
		// TODO Auto-generated method stub
		
	}

}
