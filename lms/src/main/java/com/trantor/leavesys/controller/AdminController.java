/**
 * 
 */
package com.trantor.leavesys.controller;

import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.servlet.ModelAndView;

/**
 * @author rajni.ubhi
 *
 */
@Controller
@RequestMapping("/admin")
@SessionAttributes("name")
public class AdminController {
	
	@RequestMapping(method = RequestMethod.GET)
	public ModelAndView admin() {
		String name = SecurityContextHolder.getContext().getAuthentication().getName();
		ModelAndView mav = new ModelAndView("admin");
		mav.addObject("name", name);
		return mav;
	}
}
