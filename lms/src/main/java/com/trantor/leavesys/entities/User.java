/**
 * 
 */
package com.trantor.leavesys.entities;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

import com.trantor.leavesys.business.IUser;
import com.trantor.leavesys.business.IUserRole;

/**
 * @author rajni.ubhi
 *
 */
@Entity
@Table(name = "USER_1")
public class User implements IUser {
	@Id
	@GeneratedValue
	@Column(name = "USER_ID")
	private Long userId;
	@Column(name = "USER_NAME")
	private String userName;
	@Column(name = "COMPANY_NAME")
	private String companyName;
	@Column(name = "PASSWORD")
	private String password;
	@Column(name = "IS_ENABLED")
	private boolean enabled;
	@Column(name = "IS_CREDENTIAL_NON_EXPIRED")
	private boolean credentialsNonExpired;
	@Column(name = "IS_ACCOUNT_NON_LOCKED")
	private boolean accountNonLocked;
	@ManyToMany(cascade = CascadeType.ALL, targetEntity = UserRole.class, fetch = FetchType.EAGER)
	@JoinTable(name = "USER_ROLE", joinColumns = @JoinColumn(name = "USER_ID"), inverseJoinColumns = @JoinColumn(name = "ROLE_ID"))
	private Set<IUserRole> userRoles = new HashSet<IUserRole>();

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.trantor.leavesys.business.IUser#getUserId()
	 */
	@Override
	public Long getUserId() {
		// TODO Auto-generated method stub
		return userId;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.trantor.leavesys.business.IUser#setUserId(java.lang.Long)
	 */
	@Override
	public void setUserId(Long id) {
		// TODO Auto-generated method stub
		this.userId = id;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.trantor.leavesys.business.IUser#getUserName()
	 */
	@Override
	public String getUserName() {
		// TODO Auto-generated method stub
		return userName;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.trantor.leavesys.business.IUser#setUserName(java.lang.String)
	 */
	@Override
	public void setUserName(String userName) {
		// TODO Auto-generated method stub
		this.userName = userName;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.trantor.leavesys.business.IUser#getCompanyName()
	 */
	@Override
	public String getCompanyName() {
		// TODO Auto-generated method stub
		return companyName;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.trantor.leavesys.business.IUser#setCompanyName(java.lang.String)
	 */
	@Override
	public void setCompanyName(String companyName) {
		// TODO Auto-generated method stub
		this.companyName = companyName;
	}

	@Override
	public String getPassword() {
		// TODO Auto-generated method stub
		return password;
	}

	@Override
	public void setPassword(String password) {
		// TODO Auto-generated method stub
		this.password = password;
	}

	@Override
	public boolean isEnabled() {
		// TODO Auto-generated method stub
		return enabled;
	}

	@Override
	public void setEnabled(boolean enabled) {
		// TODO Auto-generated method stub
		this.enabled = enabled;
	}

	@Override
	public boolean isCredentialNonExpired() {
		// TODO Auto-generated method stub
		return credentialsNonExpired;
	}

	@Override
	public void setCredentialNonExpired(boolean credentialNonExpired) {
		// TODO Auto-generated method stub
		this.credentialsNonExpired = credentialNonExpired;
	}

	@Override
	public boolean isAccountNonLocked() {
		// TODO Auto-generated method stub
		return accountNonLocked;
	}

	@Override
	public void setAccountNonLocked(boolean accountNonLocked) {
		// TODO Auto-generated method stub
		this.accountNonLocked = accountNonLocked;
	}

	@Override
	public Set<IUserRole> getUserRoles() {
		// TODO Auto-generated method stub
		return userRoles;
	}

	@Override
	public void setUserRoles(Set<IUserRole> userRoles) {
		// TODO Auto-generated method stub
		this.userRoles = userRoles;
	}

}
