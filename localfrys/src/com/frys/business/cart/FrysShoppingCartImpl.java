/**
 * 
 */
package com.frys.business.cart;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * @author rajni.ubhi
 *
 */
public class FrysShoppingCartImpl implements LocalFrysShoppingCartItfc{

	private Long userId;
	private Integer storeId;
	private Integer cartNumber;
	private FrysShoppingCartPK cartPk;
	
	private static final String CREATE_CART_SQL = "Insert into J1_CART (" +
			"USER_ID, STORE_ID, CART_NUM, NUM_ITEMS, TOTAL_CART_COST, DATETIME) " +
			"values (?,?,?,0,0.0,CURDATE())";
	
	private static final String DELETE_CART_SQL = "delete J1_CART where " +
			"USER_ID = ? and STORE_ID = ? and CART_NUM = ?";
	
	private static final String LOAD_CART_SQL = "select * from J1_CART where " +
			"USER_ID = ? and STORE_ID = ? and CART_NUM = ?";

	
	public FrysShoppingCartImpl(Long userId , Integer storeId , Integer cartNumber) {
		// TODO Auto-generated constructor stub
		this.userId = userId;
		this.storeId = storeId;
		this.cartNumber = cartNumber;
		cartPk = new FrysShoppingCartPK();
		cartPk.setUserId(userId);
		cartPk.setStoreId(storeId);
		cartPk.setCartNumber(cartNumber);
	}
	
	
	@Override
	public Long getUserId() {
		// TODO Auto-generated method stub
		return userId;
	}

	@Override
	public Integer getStoreId() {
		// TODO Auto-generated method stub
		return storeId;
	}

	@Override
	public Integer getCartNumber() {
		// TODO Auto-generated method stub
		return cartNumber;
	}

	@Override
	public Integer getTotalNumOfItems() {
		// TODO Auto-generated method stub
		return 0;
	}

	public static FrysShoppingCartImpl createCart(int cartNumber , int storeId , long userId) {
		System.out.println("Inside craeteCart");
		try {
			Connection con = getConnection();
			PreparedStatement pstm = con.prepareStatement(CREATE_CART_SQL);
			pstm.setLong(1, userId);
			pstm.setInt(2, storeId);
			pstm.setInt(3, cartNumber);
			int n = pstm.executeUpdate();
			System.out.println(n+" record Deleted from j1_cart..");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return new FrysShoppingCartImpl(userId, storeId, cartNumber);
	}
	
	public FrysShoppingCartImpl deleteCart() {
		System.out.println("Inside delete Cart");
		try {
			Connection con = getConnection();
			PreparedStatement pstm = con.prepareStatement(DELETE_CART_SQL);
			pstm.setLong(1, userId);
			pstm.setInt(2, storeId);
			pstm.setInt(3, cartNumber);
			int n = pstm.executeUpdate();
			System.out.println(n+" record inserted in j1_cart..");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return new FrysShoppingCartImpl(userId, storeId, cartNumber);
	}
	
	public FrysShoppingCartImpl loadCart() {
		System.out.println("Inside Load cart");
		try {
			Connection con = getConnection();
			PreparedStatement pstm = con.prepareStatement(LOAD_CART_SQL);
			ResultSet rst = null;
			pstm.setLong(1, userId);
			pstm.setInt(2, storeId);
			pstm.setInt(3, cartNumber);
			rst = pstm.executeQuery();
			if(rst.next()) {
				System.out.println("Record found..");
				return new FrysShoppingCartImpl(userId, storeId, cartNumber);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
	
	public static FrysShoppingCartImpl retrieveCart(long userId ,int storeId,int cartNumber) {
		System.out.println("Inside Load cart");
		try {
			Connection con = getConnection();
			PreparedStatement pstm = con.prepareStatement(LOAD_CART_SQL);
			ResultSet rst = null;
			pstm.setLong(1, userId);
			pstm.setInt(2, storeId);
			pstm.setInt(3, cartNumber);
			rst = pstm.executeQuery();
			if(rst.next()) {
				System.out.println("Record found..");
				return new FrysShoppingCartImpl(userId, storeId, cartNumber);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
	
	public static boolean cartExists(int cartNumber , int storeId , long userId) {
		
		try {
			Connection con = getConnection();
			PreparedStatement pstm = con.prepareStatement(LOAD_CART_SQL);
			ResultSet rst = null;
			pstm.setLong(1, userId);
			pstm.setInt(2, storeId);
			pstm.setInt(3, cartNumber);
			rst = pstm.executeQuery();
			if(rst.next()) {
				System.out.println("Record found..");
				return true;
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return false;
	}
	
	public static Connection getConnection() {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/webd","root","root");
			
			System.out.println("Connection made");
			return con;
		} catch (SQLException | ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
}
