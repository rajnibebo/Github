/**
 * 
 */
package com.frys.business.cart;

import java.rmi.RemoteException;

import javax.ejb.CreateException;
import javax.ejb.EJBHome;
import javax.ejb.FinderException;

/**
 * @author rajni.ubhi
 *
 */
public interface FrysShoppingCartHome extends EJBHome{
	public FrysShoppingCart create(Long userId , Integer storeId) throws RemoteException , CreateException;
	public FrysShoppingCart findByPrimaryKey(FrysShoppingCartPK pk) throws RemoteException ,  FinderException;
}
