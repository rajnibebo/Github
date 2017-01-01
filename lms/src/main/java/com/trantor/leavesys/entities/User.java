/**
 * 
 */
package com.trantor.leavesys.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.trantor.leavesys.business.IUser;

/**
 * @author rajni.ubhi
 *
 */
@Entity
@Table(name = "USER_1")
public class User implements IUser {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name = "USER_ID")
	private Long userId;
	@Column(name = "USER_NAME")
	private String userName;
	@Column(name = "COMPANY_NAME")
	private String companyName;
	
	/* (non-Javadoc)
	 * @see com.trantor.leavesys.business.IUser#getUserId()
	 */
	@Override
	public Long getUserId() {
		// TODO Auto-generated method stub
		return userId;
	}

	/* (non-Javadoc)
	 * @see com.trantor.leavesys.business.IUser#setUserId(java.lang.Long)
	 */
	@Override
	public void setUserId(Long id) {
		// TODO Auto-generated method stub
		this.userId = id;
	}

	/* (non-Javadoc)
	 * @see com.trantor.leavesys.business.IUser#getUserName()
	 */
	@Override
	public String getUserName() {
		// TODO Auto-generated method stub
		return userName;
	}

	/* (non-Javadoc)
	 * @see com.trantor.leavesys.business.IUser#setUserName(java.lang.String)
	 */
	@Override
	public void setUserName(String userName) {
		// TODO Auto-generated method stub
		this.userName = userName;
	}

	/* (non-Javadoc)
	 * @see com.trantor.leavesys.business.IUser#getCompanyName()
	 */
	@Override
	public String getCompanyName() {
		// TODO Auto-generated method stub
		return companyName;
	}

	/* (non-Javadoc)
	 * @see com.trantor.leavesys.business.IUser#setCompanyName(java.lang.String)
	 */
	@Override
	public void setCompanyName(String companyName) {
		// TODO Auto-generated method stub
		this.companyName = companyName;
	}

}
