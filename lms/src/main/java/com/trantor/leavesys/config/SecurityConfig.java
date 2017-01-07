/**
 * 
 */
package com.trantor.leavesys.config;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.web.authentication.rememberme.JdbcTokenRepositoryImpl;
import org.springframework.security.web.authentication.rememberme.PersistentTokenRepository;

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
	private DataSource dataSource;
//	@Autowired
//	private AuthenticationFailureHandler failureHandler;

	@Autowired
	public void configureGlobalSecurity(AuthenticationManagerBuilder builder)
			throws Exception {
		builder.userDetailsService(userService);
	}

	protected void configure(HttpSecurity http) throws Exception {
		http.authorizeRequests().antMatchers("/")
				.access("hasRole('ROLE_USER')").and().formLogin()
				.loginPage("/custom_login").loginProcessingUrl("/custom_login")
				.failureUrl("/custom_login?error").usernameParameter("userid")
				.passwordParameter("password").defaultSuccessUrl("/home", true)
				.and().rememberMe().rememberMeParameter("remember_me").tokenRepository(persistentTokenRepository())
				.tokenValiditySeconds(86400).and()
				// .logout()
				// // logoutUrl("/login?logout")
				// .logoutRequestMatcher(new AntPathRequestMatcher("/logout"))
				// .logoutSuccessUrl("/custom_login").deleteCookies("JSESSIONID")
				// .invalidateHttpSession(true).and()
				.csrf().disable();
	}
	
	@Bean
	public PersistentTokenRepository persistentTokenRepository() {
		JdbcTokenRepositoryImpl tokenRepository = new JdbcTokenRepositoryImpl();
		tokenRepository.setDataSource(dataSource);
		return tokenRepository;
	}

}
