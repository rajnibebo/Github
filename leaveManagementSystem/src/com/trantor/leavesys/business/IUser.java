package com.trantor.leavesys.business;

public interface IUser {
	public Long getUserId();
	public void setUserId(Long id);
	
	public String getUserName();
	public void setUserName(String userName);
	
	public String getCompanyName();
	public void setCompanyName(String companyName);
}
