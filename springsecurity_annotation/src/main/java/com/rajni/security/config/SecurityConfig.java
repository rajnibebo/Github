/**
 * 
 */
package com.rajni.security.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

/**
 * @author rajni.ubhi
 *
 */
@Configuration
@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter {
	@Autowired
	public void configureGlobal(AuthenticationManagerBuilder authBuilder) throws Exception {
		authBuilder.inMemoryAuthentication().withUser("Rajni").password("rajni@").roles("ADMIN");
	}
	protected void configure(HttpSecurity http) throws Exception {
		http.authorizeRequests().antMatchers("/admin/**").access("hasRole('ROLE_ADMIN')").and().formLogin();
	}
}
