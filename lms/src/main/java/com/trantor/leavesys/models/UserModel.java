/**
 * 
 */
package com.trantor.leavesys.models;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

import com.trantor.leavesys.business.IUser;

/**
 * @author rajni.ubhi
 *
 */

@XmlRootElement(name = "User")
@XmlAccessorType(XmlAccessType.FIELD)
public class UserModel implements IUser {
	@XmlElement(name = "userId")
	private Long userId;
	
	@XmlElement(name = "userName")
	private String userName;
	
	@XmlElement(name = "companyName")
	private String companyName;

	@Override
	public Long getUserId() {
		// TODO Auto-generated method stub
		return userId;
	}

	@Override
	public void setUserId(Long id) {
		// TODO Auto-generated method stub
		this.userId = id;
	}

	@Override
	public String getUserName() {
		// TODO Auto-generated method stub
		return userName;
	}

	@Override
	public void setUserName(String userName) {
		// TODO Auto-generated method stub
		this.userName = userName;
	}

	@Override
	public String getCompanyName() {
		// TODO Auto-generated method stub
		return companyName;
	}

	@Override
	public void setCompanyName(String companyName) {
		// TODO Auto-generated method stub
		this.companyName = companyName;
	}

}
