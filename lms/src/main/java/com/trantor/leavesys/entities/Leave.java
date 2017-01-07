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

import com.trantor.leavesys.business.ILeave;

/**
 * @author rajni.ubhi
 *
 */
@Entity
@Table(name = "LEAVE")
public class Leave implements ILeave {
	@Id
	@GeneratedValue
	@Column(name = "LEAVE_ID")
	private Long leaveId;
	@Column(name = "LEAVE_TYPE")
	@Enumerated(EnumType.STRING)
	private LeaveType leaveType;
	
	/* (non-Javadoc)
	 * @see com.trantor.leavesys.business.ILeave#getLeaveId()
	 */
	@Override
	public Long getLeaveId() {
		// TODO Auto-generated method stub
		return leaveId;
	}

	/* (non-Javadoc)
	 * @see com.trantor.leavesys.business.ILeave#setLeaveId(java.lang.Long)
	 */
	@Override
	public void setLeaveId(Long leaveId) {
		// TODO Auto-generated method stub
		this.leaveId = leaveId;
	}

	/* (non-Javadoc)
	 * @see com.trantor.leavesys.business.ILeave#getLeaveType()
	 */
	@Override
	public LeaveType getLeaveType() {
		// TODO Auto-generated method stub
		return leaveType;
	}

	/* (non-Javadoc)
	 * @see com.trantor.leavesys.business.ILeave#setLeaveType(com.trantor.leavesys.entities.LeaveType)
	 */
	@Override
	public void setLeaveType(LeaveType leaveType) {
		// TODO Auto-generated method stub
		this.leaveType = leaveType;
	}

}
