/**
 * 
 */
package com.frys.business.cart;

/**
 * @author rajni.ubhi
 * 
 */
public class FrysShoppingCartPK {
	public Long userId;
	public Integer storeId;
	public Integer cartNumber;

	public FrysShoppingCartPK() {
		// TODO Auto-generated constructor stub
		userId = new Long(0);
		storeId = new Integer(0);
		cartNumber = new Integer(0);
	}

	public boolean equals(Object obj) {
		if (obj instanceof FrysShoppingCartPK) {
			FrysShoppingCartPK pk = (FrysShoppingCartPK) obj;
			return pk.getUserId().equals(getUserId())
					&& pk.getCartNumber().equals(getCartNumber())
					&& pk.getStoreId().equals(getStoreId());
		}
		return false;
	}

	/**
	 * @return the userId
	 */
	public Long getUserId() {
		return userId;
	}

	/**
	 * @param userId
	 *            the userId to set
	 */
	public void setUserId(Long userId) {
		this.userId = userId;
	}

	/**
	 * @return the storeId
	 */
	public Integer getStoreId() {
		return storeId;
	}

	/**
	 * @param storeId
	 *            the storeId to set
	 */
	public void setStoreId(Integer storeId) {
		this.storeId = storeId;
	}

	/**
	 * @return the cartNumber
	 */
	public Integer getCartNumber() {
		return cartNumber;
	}

	/**
	 * @param cartNumber
	 *            the cartNumber to set
	 */
	public void setCartNumber(Integer cartNumber) {
		this.cartNumber = cartNumber;
	}

	public String toString() {
		return "userId : " + userId + " , StoreId : " + storeId
				+ " , CartId : " + cartNumber;
	}
}
