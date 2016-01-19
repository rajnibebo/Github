/**
 * 
 */
package com.Outpost.Business.Ssb;

import java.rmi.RemoteException;

import javax.ejb.CreateException;
import javax.ejb.EJBHome;

/**
 * @author rajni.ubhi
 *
 */
public interface ProcessShopListHome extends EJBHome{
	public ProcessShopListRemote create() throws RemoteException , CreateException;
}
