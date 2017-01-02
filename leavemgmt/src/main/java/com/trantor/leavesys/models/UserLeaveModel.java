package com.trantor.leavesys.models;

import java.util.Date;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

import com.trantor.leavesys.business.ILeave;
import com.trantor.leavesys.business.IUser;
import com.trantor.leavesys.business.IUserLeave;
import com.trantor.leavesys.entities.LeaveStatus;

/**
 * @author rajni.ubhi
 *
 */
@XmlRootElement(name = "UserLeave")
@XmlAccessorType(XmlAccessType.FIELD)
public class UserLeaveModel implements IUserLeave {
	@XmlElement(name = "userLeaveId")
	private Long userLeaveId;
	@XmlElement(name="leave",type=LeaveModel.class)
	private ILeave leave;
	@XmlElement(name = "user",type=UserModel.class)
	private IUser user;
	@XmlElement(name = "leaveReason")
	private String leaveReason;
	@XmlElement(name = "leaveStartDate")
	private Date startDate;
	@XmlElement(name = "leaveEndDate")
	private Date endDate;
	@XmlElement(name = "leaveStatus")
	private LeaveStatus leaveStatus;

	public UserLeaveModel() {
		// TODO Auto-generated constructor stub
		this.leave = new LeaveModel();
		this.user = new UserModel();
	}
	@Override
	public Long getUserLeaveId() {
		// TODO Auto-generated method stub
		return userLeaveId;
	}

	@Override
	public void setUserLeaveId(Long userLeaveId) {
		// TODO Auto-generated method stub
		this.userLeaveId = userLeaveId;
	}

	@Override
	public ILeave getLeave() {
		// TODO Auto-generated method stub
		return leave;
	}

	@Override
	public void setLeave(ILeave iLeave) {
		// TODO Auto-generated method stub
		this.leave = iLeave;
	}

	@Override
	public String getLeaveReason() {
		// TODO Auto-generated method stub
		return leaveReason;
	}

	@Override
	public void setLeaveReason(String leaveReason) {
		// TODO Auto-generated method stub
		this.leaveReason = leaveReason;
	}

	@Override
	public IUser getUser() {
		// TODO Auto-generated method stub
		return user;
	}

	@Override
	public void setUser(IUser user) {
		// TODO Auto-generated method stub
		this.user = user;
	}

	@Override
	public Date getStartDate() {
		// TODO Auto-generated method stub
		return startDate;
	}

	@Override
	public void setStartDate(Date date) {
		// TODO Auto-generated method stub
		this.startDate = date;
	}

	@Override
	public Date getEndDate() {
		// TODO Auto-generated method stub
		return endDate;
	}

	@Override
	public void setEndDate(Date date) {
		// TODO Auto-generated method stub
		this.endDate = date;
	}

	@Override
	public LeaveStatus getLeaveStatus() {
		// TODO Auto-generated method stub
		return leaveStatus;
	}

	@Override
	public void setLeaveStatus(LeaveStatus leaveStatus) {
		// TODO Auto-generated method stub
		this.leaveStatus = leaveStatus;
	}
	
	public String toString() {
		return "UserLeaveModel :: ["+leaveReason+",user :"+user.getUserId()+",leave :"+leave.getLeaveId()+",startDate:"
				+startDate+",endDate : "+endDate+",leavestatus :: "+leaveStatus+"]";
	}
}
