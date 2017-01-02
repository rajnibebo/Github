/**
 * 
 */
package com.trantor.leavesys.service;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.trantor.leavesys.entities.Leave;
import com.trantor.leavesys.entities.adapter.IEntityConverter;
import com.trantor.leavesys.models.LeaveModel;
import com.trantor.leavesys.repository.LeaveRepository;
import com.trantor.leavesys.service.api.ILeaveService;

/**
 * @author rajni.ubhi
 *
 */
@Service("leaveService")
public class LeaveService implements ILeaveService {
	
	@Resource(name = "leaveRepository")
	private LeaveRepository leaveRepository;
	
	@Resource(name = "leaveConverter")
	private IEntityConverter<LeaveModel, Leave> leaveConverter;
	
	@Transactional(readOnly = true)
	public List<LeaveModel> getAllLeaves() {
		List<LeaveModel> list = new ArrayList<>();
		List<Leave> leaves = leaveRepository.findAll();
		for(Leave leave : leaves) {
			LeaveModel convertedLeave = leaveConverter.convertEntityToModel(leave);
			list.add(convertedLeave);
		}
		return list;
	}
}
