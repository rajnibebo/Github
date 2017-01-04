/**
 * 
 */
package com.trantor.leavesys.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.trantor.leavesys.models.UserModel;

/**
 * @author rajni.ubhi
 *
 */
@Controller
@RequestMapping("/home")
public class HomeController {
	
	@RequestMapping(method = RequestMethod.GET)
	public ModelAndView home() {
		System.out.println("Welcome to homeController");
		ModelAndView mav = new ModelAndView("index");
		UserModel model = new UserModel();
		mav.addObject("userObj", model);
		return mav;
	}
}
