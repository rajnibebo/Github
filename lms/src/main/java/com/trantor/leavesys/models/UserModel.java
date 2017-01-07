/**
 * 
 */
package com.trantor.leavesys.models;

import java.util.HashSet;
import java.util.Set;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

import com.trantor.leavesys.business.IUser;
import com.trantor.leavesys.business.IUserRole;

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

	private String password;
	private boolean enabled;
	private boolean credentialNonExpired;
	private boolean accountNonLocked;
	private Set<IUserRole> roles = new HashSet<IUserRole>();
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

	public boolean isCredentialNonExpired() {
		return credentialNonExpired;
	}

	public void setCredentialNonExpired(boolean credentialNonExpired) {
		this.credentialNonExpired = credentialNonExpired;
	}

	public void setAccountNonLocked(boolean accountNonLocked) {
		this.accountNonLocked = accountNonLocked;
	}
	public boolean isAccountNonLocked() {
		return accountNonLocked;
	}

	@Override
	public Set<IUserRole> getUserRoles() {
		// TODO Auto-generated method stub
		return roles;
	}

	@Override
	public void setUserRoles(Set<IUserRole> userRoles) {
		// TODO Auto-generated method stub
		this.roles = userRoles;
	}

}