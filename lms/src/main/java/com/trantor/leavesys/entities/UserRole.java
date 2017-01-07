/**
 * 
 */
package com.trantor.leavesys.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import com.trantor.leavesys.business.IUserRole;

/**
 * @author rajni.ubhi
 *
 */
@Entity
@Table(name = "ROLES")
public class UserRole implements IUserRole {
	@Id
	@GeneratedValue
	@Column(name = "ROLE_ID")
	private Long roleId;
	@Column(name = "ROLE_NAME")
	@Enumerated(EnumType.STRING)
	private RoleType role;
	
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
		return role;
	}

	@Override
	public void setUserRole(RoleType role) {
		// TODO Auto-generated method stub
		this.role = role;
	}

}