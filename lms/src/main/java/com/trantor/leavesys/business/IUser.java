package com.trantor.leavesys.business;

import java.util.Set;

public interface IUser {
	
	public Long getUserId();
	public void setUserId(Long id);
	
	public String getUserName();
	public void setUserName(String userName);
	
	public String getCompanyName();
	public void setCompanyName(String companyName);
	
	public String getPassword();
	public void setPassword(String password);
	
	public boolean isEnabled();
	public void setEnabled(boolean enabled);
	
	public boolean isCredentialNonExpired();
	public void setCredentialNonExpired(boolean credentialNonExpired);
	
	public boolean isAccountNonLocked();
	public void setAccountNonLocked(boolean accountNonLocked);
	
	public Set<IUserRole> getUserRoles();
	public void setUserRoles(Set<IUserRole> userRoles);
}
