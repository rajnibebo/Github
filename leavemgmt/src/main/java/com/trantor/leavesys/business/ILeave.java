package com.trantor.leavesys.business;

import com.trantor.leavesys.entities.LeaveType;

public interface ILeave {
	public Long getLeaveId();
	public void setLeaveId(Long leaveId);
	
	public LeaveType getLeaveType();
	public void setLeaveType(LeaveType leaveType);
}
