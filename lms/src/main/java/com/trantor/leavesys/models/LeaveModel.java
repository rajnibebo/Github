package com.trantor.leavesys.models;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

import com.trantor.leavesys.business.ILeave;
import com.trantor.leavesys.entities.LeaveType;

/**
 * @author rajni.ubhi
 *
 */
@XmlRootElement(name = "Leave")
@XmlAccessorType(XmlAccessType.FIELD)
public class LeaveModel implements ILeave {
	@XmlElement(name = "leaveId")
	private Long leaveId;
	@XmlElement(name = "leaveType")
	private LeaveType leaveType = LeaveType.CL;
	
	@Override
	public Long getLeaveId() {
		// TODO Auto-generated method stub
		return leaveId;
	}

	@Override
	public void setLeaveId(Long leaveId) {
		// TODO Auto-generated method stub
		this.leaveId = leaveId;
	}

	@Override
	public LeaveType getLeaveType() {
		// TODO Auto-generated method stub
		return leaveType;
	}

	@Override
	public void setLeaveType(LeaveType leaveType) {
		// TODO Auto-generated method stub
		this.leaveType = leaveType;
	}

}
