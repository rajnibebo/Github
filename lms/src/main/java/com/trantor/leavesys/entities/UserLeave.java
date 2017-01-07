/**
 * 
 */
package com.trantor.leavesys.entities;

import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import com.trantor.leavesys.business.ILeave;
import com.trantor.leavesys.business.IUser;
import com.trantor.leavesys.business.IUserLeave;
/**
 * @author rajni.ubhi
 *
 */
@Entity
@Table(name = "USER_APPLIED_LEAVE")
public class UserLeave implements IUserLeave {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "USER_LEAVE_ID")
	private Long userLeaveId;
	@ManyToOne(cascade = CascadeType.ALL, targetEntity = Leave.class)
	@JoinColumn(name = "LEAVE_ID")
	private ILeave leave;
	@ManyToOne(cascade = CascadeType.ALL, targetEntity = User.class)
	@JoinColumn(name = "USER_ID")
	private IUser user;
	@Column(name = "LEAVE_REASON")
	private String leaveReason;
	@Column(name = "LEAVE_STATUS", columnDefinition = "varchar(32) default 'NOT_APPROVED'", insertable = false)
	@Enumerated(EnumType.STRING)
	private LeaveStatus leaveStatus;
	@Column(name = "LEAVE_START_DATE")
	@Temporal(TemporalType.DATE)
	private Date startDate;
	@Column(name = "LEAVE_END_DATE")
	@Temporal(TemporalType.DATE)
	private Date endDate;

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

}
