/**
 * 
 */
package com.trantor.leavesys.service;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.trantor.leavesys.entities.Leave;
import com.trantor.leavesys.entities.User;
import com.trantor.leavesys.entities.UserLeave;
import com.trantor.leavesys.entities.adapter.IEntityConverter;
import com.trantor.leavesys.models.UserLeaveModel;
import com.trantor.leavesys.repository.LeaveRepository;
import com.trantor.leavesys.repository.UserLeaveRepository;
import com.trantor.leavesys.repository.UserRepository;
import com.trantor.leavesys.service.api.IUserLeaveService;

/**
 * @author rajni.ubhi
 *
 */
@Service("userLeaveService")
public class UserLeaveServcice implements IUserLeaveService {
	
	@Resource(name = "userLeaveRepository")
	private UserLeaveRepository userLeaveRepository;
	
	@Resource(name = "userRepository")
	private UserRepository userRepository;
	
	@Resource(name = "leaveRepository")
	private LeaveRepository leaveRepository;
	@Resource(name = "userLeaveConverter")
	private IEntityConverter<UserLeaveModel, UserLeave> userLeaveConverter;

	@Transactional
	public UserLeaveModel saveAppliedLeave(UserLeaveModel model) {
		UserLeave userLeave = userLeaveConverter.convertModelToEntity(model);
		
		System.out.println(model.getUser().getUserId());
		System.out.println(model.getLeave().getLeaveId());
		
		User user = userRepository.findOne(model.getUser().getUserId());
		Leave leave = leaveRepository.findOne(model.getLeave().getLeaveId());
		userLeave.setUser(user);
		userLeave.setLeave(leave);
		
		userLeaveRepository.save(userLeave);
		
		return userLeaveConverter.convertEntityToModel(userLeave);
	}
}
