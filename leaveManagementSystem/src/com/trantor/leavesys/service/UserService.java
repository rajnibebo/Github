/**
 * 
 */
package com.trantor.leavesys.service;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.trantor.leavesys.entities.User;
import com.trantor.leavesys.entities.adapter.IEntityConverter;
import com.trantor.leavesys.models.UserModel;
import com.trantor.leavesys.repository.UserRepository;
import com.trantor.leavesys.service.api.IUserService;

/**
 * @author rajni.ubhi
 *
 */
@Service("userService")
@Transactional
public class UserService implements IUserService {
	
	@Resource(name = "userRepository")
	private UserRepository userRepository;
	
	@Resource(name = "userConverter")
	private IEntityConverter<UserModel, User> userConverter;
	
	public UserModel getUserModel(UserModel userModel) {
		if(userModel != null && userModel.getUserId() != null) {
			User entity = userRepository.findOne(userModel.getUserId());
			return userConverter.convertEntityToModel(entity); 
		}
		return null;
	}
}
