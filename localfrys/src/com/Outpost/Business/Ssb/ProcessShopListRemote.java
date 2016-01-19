/**
 * 
 */
package com.Outpost.Business.Ssb;

import java.rmi.RemoteException;

import javax.ejb.EJBObject;

/**
 * @author rajni.ubhi
 *
 */
public interface ProcessShopListRemote extends EJBObject{
	public void parseOrder() throws RemoteException;
}
