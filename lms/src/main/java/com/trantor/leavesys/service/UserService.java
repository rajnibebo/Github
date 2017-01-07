/**
 * 
 */
package com.trantor.leavesys.service;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.trantor.leavesys.business.IUser;
import com.trantor.leavesys.business.IUserRole;
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
public class UserService implements IUserService, UserDetailsService {

	@Resource(name = "userRepository")
	private UserRepository userRepository;

	@Resource(name = "userConverter")
	private IEntityConverter<UserModel, User> userConverter;

	@Transactional(readOnly = true)
	public UserModel getUserModel(UserModel userModel) {
		if (userModel != null && userModel.getUserId() != null) {
			User entity = userRepository.findOne(userModel.getUserId());
			return userConverter.convertEntityToModel(entity);
		}
		return null;
	}

	@Override
	@Transactional(readOnly = true)
	public UserDetails loadUserByUsername(String userId) throws UsernameNotFoundException {
		// TODO Auto-generated method stub
		IUser user = userRepository.getUserByUserName(userId);
		if (user == null) {
			throw new UsernameNotFoundException("This user does not exist");
		}
		org.springframework.security.core.userdetails.User authUser = new org.springframework.security.core.userdetails.User(
				user.getUserName(), user.getPassword(), user.isEnabled(), user.isAccountNonLocked(),
				user.isCredentialNonExpired(), user.isAccountNonLocked(), getGrantedAuthorities(user));
		return authUser;
	}

	private List<GrantedAuthority> getGrantedAuthorities(IUser user) {
		List<GrantedAuthority> authorities = new ArrayList<GrantedAuthority>();
		for(IUserRole role : user.getUserRoles()) {
			GrantedAuthority auth = new SimpleGrantedAuthority(role.getUserRole().name());
			authorities.add(auth);
		}
		return authorities;
	}

	@Override
	@Transactional(readOnly = true)
	public List<UserModel> listUsers() {
		// TODO Auto-generated method stub
		List<User> listOfUsers = userRepository.findAll();
		List<UserModel> list = new ArrayList<UserModel>();
		for (User user : listOfUsers) {
			list.add(userConverter.convertEntityToModel(user));
		}
		return list;
	}
}