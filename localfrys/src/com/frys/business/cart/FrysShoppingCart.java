/**
 * 
 */
package com.frys.business.cart;

import java.rmi.RemoteException;

import javax.ejb.EJBObject;

/**
 * @author rajni.ubhi
 *
 */
public interface FrysShoppingCart extends EJBObject , LocalFrysShoppingCartItfc{
	 public LocalFrysShoppingCartItfc getLocalImpl() throws RemoteException;
}
