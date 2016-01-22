/**
 * 
 */
package com.Outpost.Entity;

import java.rmi.RemoteException;
import java.sql.Timestamp;

import javax.ejb.CreateException;
import javax.ejb.EJBHome;
import javax.ejb.FinderException;

/**
 * @author rajni.ubhi
 * 
 */
public interface AccountHome extends EJBHome {
	public AccountRemote findByPrimaryKey(java.lang.Long accountId)
			throws FinderException, RemoteException;

	public AccountRemote findByOwnerUserId(java.lang.Long accountId)
			throws FinderException, RemoteException;

	public AccountRemote create(java.lang.Long accountId, java.lang.Long storeId,
			java.lang.Long parentAccountId, java.lang.Long ownerUserId, java.sql.Timestamp dateTime)
			throws CreateException, RemoteException;
}
