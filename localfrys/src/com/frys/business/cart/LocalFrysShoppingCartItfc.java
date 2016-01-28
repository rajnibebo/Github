/**
 * 
 */
package com.frys.business.cart;

import java.rmi.RemoteException;

/**
 * @author rajni.ubhi
 *
 */
public interface LocalFrysShoppingCartItfc {
	public Long getUserId() throws RemoteException;
	public Integer getStoreId() throws RemoteException;
	public Integer getCartNumber() throws RemoteException;
	public Integer getTotalNumOfItems() throws RemoteException;
}
