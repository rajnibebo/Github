/**
 * 
 */
package com.Outpost.Entity;

import java.rmi.RemoteException;
import java.sql.Timestamp;

import javax.ejb.CreateException;
import javax.ejb.EJBException;
import javax.ejb.EntityBean;
import javax.ejb.EntityContext;
import javax.ejb.RemoveException;

/**
 * @author rajni.ubhi
 *
 */
public abstract class Account implements EntityBean{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public abstract void  setAccountId(java.lang.Long id);
	public abstract Long getAccountId();
	
	public abstract void  setStoreId(java.lang.Long id);
	public abstract Long getStoreId();
	
	public abstract void  setParentAccountId(java.lang.Long id);
	public abstract Long getParentAccountId();
	
	public abstract void  setUserOwnerId(java.lang.Long id);
	public abstract Long getUserOwnerId();
	
	public abstract void  setDateTime(java.sql.Timestamp id);
	public abstract Timestamp getDateTime();
	
	public java.lang.Long ejbCreate(java.lang.Long accountId , java.lang.Long storeId , java.lang.Long parentAccountId, java.lang.Long userOwnerId , java.sql.Timestamp timestamp) throws EJBException , RemoteException , CreateException {
		System.out.println("Inside ejbCreate()..");
		setAccountId(accountId);
		setStoreId(storeId);
		setParentAccountId(parentAccountId);
		setUserOwnerId(userOwnerId);
		setDateTime(timestamp);	
		return null;
	}
	
	public void ejbPostCreate(java.lang.Long accountId , java.lang.Long storeId , java.lang.Long parentAccountId, java.lang.Long userOwnerId , java.sql.Timestamp timestamp) {
		System.out.println("Inside ejbPostCreate()..");
	}
	
	@Override
	public void ejbActivate() throws EJBException, RemoteException {
		// TODO Auto-generated method stub
		System.out.println("Inside Ejb Activate()..");
	}

	@Override
	public void ejbLoad() throws EJBException, RemoteException {
		// TODO Auto-generated method stub
		System.out.println("Inside EjbLoad()..");
	}

	@Override
	public void ejbPassivate() throws EJBException, RemoteException {
		// TODO Auto-generated method stub
		System.out.println("Inside EjbPassivate()..");
	}

	@Override
	public void ejbRemove() throws RemoveException, EJBException,
			RemoteException {
		// TODO Auto-generated method stub
		System.out.println("Inside EjbRemove()..");
	}

	@Override
	public void ejbStore() throws EJBException, RemoteException {
		// TODO Auto-generated method stub
		System.out.println("Inside EjbStore()..");
	}

	@Override
	public void setEntityContext(EntityContext arg0) throws EJBException,
			RemoteException {
		// TODO Auto-generated method stub
		System.out.println("Inside setEntityContext()..");
	}

	@Override
	public void unsetEntityContext() throws EJBException, RemoteException {
		// TODO Auto-generated method stub
		System.out.println("Inside unsetEntityContext()..");
	}

}
