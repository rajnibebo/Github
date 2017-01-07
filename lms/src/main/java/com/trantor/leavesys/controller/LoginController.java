/**
 * 
 */
package com.trantor.leavesys.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.web.authentication.logout.SecurityContextLogoutHandler;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

/**
 * @author rajni.ubhi
 *
 */
@Controller
@RequestMapping("/")
public class LoginController {
	
	@RequestMapping(value = "/custom_login", method = RequestMethod.GET)
	public ModelAndView login(
			@RequestParam(value = "error", required = false) String error,
			@RequestParam(value="logout",required = false) String logout) {
		
		System.out.println("Inside the login controller");
		ModelAndView mav = new ModelAndView("pages/examples/login");
		Authentication auth = SecurityContextHolder.getContext().getAuthentication();
		if(auth != null) {
			System.out.println("Authentication object still exists");
			System.out.println("Username ::"+auth.getName()+","+auth.getCredentials());
		}
		if(error != null) {
			mav.addObject("error", "Invalid Details !! Please try again");
		}
		if(logout != null) {
			mav.addObject("logout", "You have logged out of the application !!!");
		}
		return mav;
	}
	
	@RequestMapping(value="/custom_logout",method = RequestMethod.GET)
	public String logout(HttpServletRequest request , HttpServletResponse response) {
		Authentication auth = SecurityContextHolder.getContext().getAuthentication();
		if(auth != null) {
			new SecurityContextLogoutHandler().logout(request, response, auth);
		}
		return "redirect:/custom_login?logout";
	}

}
