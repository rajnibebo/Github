/**
 * 
 */
package com.rajni.spring.aop.security;

/**
 * @author rajni.ubhi
 *
 */
public class UserInfo {
	private String userName;
	private String password;
	
	public UserInfo(String userName , String password) {
		// TODO Auto-generated constructor stub
		this.userName = userName;
		this.password = password;
	}
	/**
	 * @return the userName
	 */
	public String getUserName() {
		return userName;
	}
	/**
	 * @param userName the userName to set
	 */
	public void setUserName(String userName) {
		this.userName = userName;
	}
	/**
	 * @return the password
	 */
	public String getPassword() {
		return password;
	}
	/**
	 * @param password the password to set
	 */
	public void setPassword(String password) {
		this.password = password;
	}
	
	
	public String toString() {
		return "user : "+userName+" -- > password :"+password;
	}
	
}
