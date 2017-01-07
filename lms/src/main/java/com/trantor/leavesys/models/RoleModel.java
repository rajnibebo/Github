package com.trantor.leavesys.models;

import com.trantor.leavesys.business.IUserRole;
import com.trantor.leavesys.entities.RoleType;

/**
 * @author rajni.ubhi
 *
 */
public class RoleModel implements IUserRole {
	private Long roleId;
	private RoleType roleName;
	@Override
	public Long getUserRoleId() {
		// TODO Auto-generated method stub
		return roleId;
	}

	@Override
	public void setUserRoleId(Long userRoleId) {
		// TODO Auto-generated method stub
		this.roleId = userRoleId;
	}

	@Override
	public RoleType getUserRole() {
		// TODO Auto-generated method stub
		return roleName;
	}

	@Override
	public void setUserRole(RoleType role) {
		// TODO Auto-generated method stub
		this.roleName = role;
	}

}