/**
 * 
 */
package com.trantor.leavesys.business;

import com.trantor.leavesys.entities.RoleType;

/**
 * @author rajni.ubhi
 *
 */
public interface IUserRole {
	public Long getUserRoleId();
	public void setUserRoleId(Long userRoleId);
	
	public RoleType getUserRole();
	public void setUserRole(RoleType role);
	
//	public IUser getUser();
//	public void setUser(IUser user);
}
