/**
 * 
 */
package com.trantor.leavesys.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

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
	public void configAuthentication(AuthenticationManagerBuilder auBuilder) throws Exception {
		auBuilder.userDetailsService(userService);
	}

	protected void configure(HttpSecurity http) throws Exception {
		http.authorizeRequests().antMatchers("/").access("hasRole('ROLE_USER')").and().formLogin()
				.loginPage("/userlogin").usernameParameter("username").passwordParameter("password")
				.loginProcessingUrl("/custom_login").failureUrl("/custom_login?error").and().logout()
				.logoutUrl("/custom_login/logout").logoutSuccessUrl("/custom_login?logout").and().exceptionHandling()
				.accessDeniedPage("/403").and().csrf();
	}

	@Bean
	public PasswordEncoder passwordEncoder() {
		PasswordEncoder encoder = new BCryptPasswordEncoder();
		return encoder;
	}
}
