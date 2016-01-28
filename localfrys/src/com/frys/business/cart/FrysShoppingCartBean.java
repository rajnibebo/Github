/**
 * 
 */
package com.frys.business.cart;

import java.rmi.RemoteException;

import javax.ejb.CreateException;
import javax.ejb.EJBException;
import javax.ejb.EntityBean;
import javax.ejb.EntityContext;
import javax.ejb.FinderException;
import javax.ejb.RemoveException;

/**
 * @author rajni.ubhi
 *
 */
public class FrysShoppingCartBean implements EntityBean {

	/**
	 * 
	 */
	private static final long serialVersionUID = -2119801771064826670L;
	private FrysShoppingCartImpl impl;
	EntityContext context;
	
	public FrysShoppingCartPK ejbCreate(Long userID , Integer storeID) throws CreateException {
		if ((userID == null) || (storeID == null)) {
			throw new CreateException("Null parameters. Creation failed.");
		}
		FrysShoppingCartPK pk = new FrysShoppingCartPK();
		pk.setCartNumber(1);
		pk.setUserId(userID);
		pk.setStoreId(storeID);
		impl = FrysShoppingCartImpl.createCart(1, storeID, userID);
		System.out.println("Ejb Create Complete..");
		return pk;
	}
	
	public void ejbPostCreate(Long userId , Integer storeId) {
		System.out.println("Inside ejbPostCreate of FrysShoppingCartBean");
	}
	@Override
	public void ejbActivate() throws EJBException, RemoteException {
		// TODO Auto-generated method stub
		System.out.println("Ejb Activate..");
	}

	@Override
	public void ejbLoad() throws EJBException, RemoteException {
		// TODO Auto-generated method stub
		System.out.println("Ejb Load..");
		if(impl != null) {
			impl.loadCart();
		}
	}

	public FrysShoppingCartPK ejbFindByPrimaryKey(FrysShoppingCartPK pk) throws RemoteException , FinderException{
		if(FrysShoppingCartImpl.cartExists(pk.getCartNumber(), pk.getStoreId(), pk.getUserId())) {
			impl = FrysShoppingCartImpl.retrieveCart(pk.getUserId(), pk.getStoreId(), pk.getCartNumber());
			return pk;
		}
		return null;
	}
	@Override
	public void ejbPassivate() throws EJBException, RemoteException {
		// TODO Auto-generated method stub
		System.out.println("Ejb passivate..");
		impl = null;
	}

	@Override
	public void ejbRemove() throws RemoveException, EJBException,
			RemoteException {
		// TODO Auto-generated method stub
		System.out.println("Inside EjbRemove..");
		if(impl != null) {
			impl.deleteCart();
		}
	}

	@Override
	public void ejbStore() throws EJBException, RemoteException {
		// TODO Auto-generated method stub
		System.out.println("Inside ejbStore..");
	}

	@Override
	public void setEntityContext(EntityContext arg0) throws EJBException,
			RemoteException {
		// TODO Auto-generated method stub
		System.out.println("set entityContext");
		context = arg0;	
	}

	@Override
	public void unsetEntityContext() throws EJBException, RemoteException {
		// TODO Auto-generated method stub
		System.out.println("UnsetEntity context");
		context = null;
		impl = null;
	}

	public LocalFrysShoppingCartItfc getLocalImpl() {
		return impl;
	}

	public Long getUserId() throws RemoteException{
		// TODO Auto-generated method stub
		return impl.getUserId();
	}

	public Integer getStoreId() throws RemoteException{
		// TODO Auto-generated method stub
		return impl.getStoreId();
	}

	public Integer getCartNumber() throws RemoteException{
		// TODO Auto-generated method stub
		return impl.getCartNumber();
	}

	public Integer getTotalNumOfItems() throws RemoteException{
		// TODO Auto-generated method stub
		return impl.getTotalNumOfItems();
	}
}
