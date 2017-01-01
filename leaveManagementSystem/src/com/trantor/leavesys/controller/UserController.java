/**
 * 
 */
package com.trantor.leavesys.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.trantor.leavesys.models.UserModel;
import com.trantor.leavesys.service.api.IUserService;

/**
 * @author rajni.ubhi
 *
 */
@RestController
@RequestMapping("/usr")
public class UserController {
	@Autowired
	private IUserService userService;
	
	@RequestMapping(value ="/get",method=RequestMethod.POST)
	public ModelAndView getUserModel(@ModelAttribute("userObj") UserModel userModel) {
		ModelAndView mav = new ModelAndView("userHome");
		UserModel model = userService.getUserModel(userModel);
		mav.addObject("userObj", model);
		return mav;
	}
}
