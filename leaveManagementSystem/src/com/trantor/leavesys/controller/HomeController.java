/**
 * 
 */
package com.trantor.leavesys.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.trantor.leavesys.models.UserModel;

/**
 * @author rajni.ubhi
 *
 */
@Controller
@RequestMapping("/home")
public class HomeController {
	
	@RequestMapping(method = RequestMethod.GET)
	public String home(Model modelObj) {
		System.out.println("Welcome to homeController");
		UserModel model = new UserModel();
		modelObj.addAttribute("userObj", model);
		return "index";
	}
}
