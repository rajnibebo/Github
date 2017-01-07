/**
 * 
 */
package com.trantor.leavesys.service.api;

import java.util.List;

import com.trantor.leavesys.models.UserModel;

/**
 * @author rajni.ubhi
 *
 */
public interface IUserService {
	public UserModel getUserModel(UserModel userModel);
	
	public List<UserModel> listUsers();
}