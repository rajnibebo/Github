/**
 * 
 */
package com.trantor.leavesys.business;

import com.trantor.leavesys.entities.Roles;

/**
 * @author rajni.ubhi
 *
 */
public interface IUserRole {
	public Long getUserRoleId();
	public void setUserRoleId(Long userRoleId);
	
	public Roles getUserRole();
	public void setUserRole(Roles role);
	
//	public IUser getUser();
//	public void setUser(IUser user);
}
