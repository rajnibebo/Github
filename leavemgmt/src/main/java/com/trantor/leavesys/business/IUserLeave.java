package com.trantor.leavesys.business;

import java.util.Date;

import com.trantor.leavesys.entities.LeaveStatus;

public interface IUserLeave {
	public Long getUserLeaveId();
	public void setUserLeaveId(Long userLeaveId);
	
	public ILeave getLeave();
	public void setLeave(ILeave iLeave);
	
	public String getLeaveReason();
	public void setLeaveReason(String leaveReason);
	
	public IUser getUser();
	public void setUser(IUser user);
	
	public Date getStartDate();
	public void setStartDate(Date date);
	
	public Date getEndDate();
	public void setEndDate(Date date);
	
	public LeaveStatus getLeaveStatus();
	public void setLeaveStatus(LeaveStatus leaveStatus);
}
