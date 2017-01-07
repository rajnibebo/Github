/**
 * 
 */
package com.trantor.leavesys.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.trantor.leavesys.entities.Leave;
import com.trantor.leavesys.entities.User;
import com.trantor.leavesys.entities.UserLeave;
import com.trantor.leavesys.entities.adapter.EntityConverter;
import com.trantor.leavesys.entities.adapter.IEntityConverter;
import com.trantor.leavesys.models.LeaveModel;
import com.trantor.leavesys.models.UserLeaveModel;
import com.trantor.leavesys.models.UserModel;

/**
 * @author rajni.ubhi
 *
 */
@Configuration
@ComponentScan(basePackages="com.trantor.leavesys")
public class AppConfig {
	@Bean
	public IEntityConverter<UserModel, User> userConverter() {
		return EntityConverter.getUserConverter();
	}
	@Bean
	public IEntityConverter<LeaveModel, Leave> leaveConverter() {
		return EntityConverter.getLeaveConverter();
	}
	@Bean
	public IEntityConverter<UserLeaveModel, UserLeave> userLeaveConverter() {
		return EntityConverter.getUserLeaveConverter();
	}
}
