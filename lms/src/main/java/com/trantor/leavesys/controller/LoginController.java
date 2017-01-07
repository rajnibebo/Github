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
@RequestMapping("/custom_login")
public class LoginController {

	@RequestMapping(method = RequestMethod.GET)
	public ModelAndView login(@RequestParam(value = "error", required = false) String error) {
		System.out.println("Inside login !!!!!!!!");
		ModelAndView model = new ModelAndView();

		if (error != null) {
			model.addObject("error", "Invalid username and password!");
		}
		model.setViewName("login");

		return model;

	}

	@RequestMapping(value="/logout",method = RequestMethod.GET)
	public ModelAndView logout(@RequestParam(value = "logout", required = false) String error,HttpServletRequest request, HttpServletResponse response) {
		System.out.println("Inside logout !!!!!!!!");
		ModelAndView model = new ModelAndView();

		if (error != null) {
			model.addObject("logout", "Invalid username and password!");
		}
		Authentication auth = SecurityContextHolder.getContext().getAuthentication();
	    if (auth != null){    
	        new SecurityContextLogoutHandler().logout(request, response, auth);
	    }
		model.setViewName("login");
		
		return model;

	}

}
