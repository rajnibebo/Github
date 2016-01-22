/**
 * 
 */
package com.Outpost.Entity;

import java.rmi.RemoteException;
import java.sql.Timestamp;

import javax.ejb.EJBObject;

/**
 * @author rajni.ubhi
 *
 */
public interface AccountRemote extends EJBObject{
	public abstract void  setAccountId(java.lang.Long id) throws RemoteException;
	public abstract java.lang.Long getAccountId() throws RemoteException;
	
	public abstract void  setStoreId(java.lang.Long id) throws RemoteException;
	public abstract java.lang.Long getStoreId() throws RemoteException;
	
	public abstract void  setParentAccountId(java.lang.Long id) throws RemoteException;
	public abstract java.lang.Long getParentAccountId() throws RemoteException;
	
	public abstract void  setUserOwnerId(java.lang.Long id) throws RemoteException;
	public abstract java.lang.Long getUserOwnerId() throws RemoteException;
	
	public abstract void  setDateTime(java.sql.Timestamp id) throws RemoteException;
	public abstract java.sql.Timestamp getDateTime() throws RemoteException;
}
