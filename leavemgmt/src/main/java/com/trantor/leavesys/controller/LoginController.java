/**
 * 
 */
package com.trantor.leavesys.controller;

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
		
		if(error != null) {
			mav.addObject("error", "Invalid Details !! Please try again");
		}
		if(logout != null) {
			mav.addObject("logout", "You have logged out of the application !!!");
		}
		return mav;
	}

}
