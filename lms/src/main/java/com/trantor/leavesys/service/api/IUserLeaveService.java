/**
 * 
 */
package com.trantor.leavesys.service.api;

import com.trantor.leavesys.models.UserLeaveModel;

/**
 * @author rajni.ubhi
 *
 */
public interface IUserLeaveService {
	public UserLeaveModel saveAppliedLeave(UserLeaveModel model);
}
