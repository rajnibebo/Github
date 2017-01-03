/**
 * 
 */
package com.trantor.leavesys.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.UserDetailsService;

/**
 * @author rajni.ubhi
 *
 */
@Configuration
@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter {
	@Autowired
	private UserDetailsService userService;

	@Autowired
	public void configureGlobalSecurity(AuthenticationManagerBuilder builder)
			throws Exception {
		builder.userDetailsService(userService);
	}

	protected void configure(HttpSecurity http) throws Exception {
		http.authorizeRequests().antMatchers("/")
				.access("hasRole('ROLE_USER')").and().formLogin()
				.loginPage("/login").loginProcessingUrl("/login")
				.usernameParameter("userId").passwordParameter("password")
				.and().csrf().disable();
	}
}