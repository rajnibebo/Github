/**
 * 
 */
package com.trantor.leavesys.controller;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.trantor.leavesys.models.LeaveModel;
import com.trantor.leavesys.models.UserLeaveModel;
import com.trantor.leavesys.models.UserModel;
import com.trantor.leavesys.service.api.ILeaveService;
import com.trantor.leavesys.service.api.IUserLeaveService;

/**
 * @author rajni.ubhi
 *
 */
@RestController
@RequestMapping("/apply")
public class UserLeaveController {
	@Autowired
	private ILeaveService leaveService;
	
	@Autowired
	private IUserLeaveService userLeaveServcice;
	
	@InitBinder
	public void initBinder(WebDataBinder binder) {
	    CustomDateEditor editor = new CustomDateEditor(new SimpleDateFormat("MM/dd/yyyy"), true);
	    binder.registerCustomEditor(Date.class, editor);
	}
	
	@RequestMapping(value = "/create", method = RequestMethod.POST)
	public ModelAndView createForm(@ModelAttribute("userObj") UserModel userModel) {
		ModelAndView mav = new ModelAndView("applyLeave");
		UserLeaveModel userLeaveModel = new UserLeaveModel();
		userLeaveModel.setUser(userModel);
		userLeaveModel.setStartDate(new Date());
		userLeaveModel.setEndDate(new Date());
		userLeaveModel.setLeave(new LeaveModel());
		mav.addObject("userLeaveModel", userLeaveModel);
		mav.addObject("leaves",leaveService.getAllLeaves());
		System.out.println("Creating UserLeaveModel:::"+userLeaveModel);
		return mav;
	}
	
	@RequestMapping(value = "/add", method = RequestMethod.POST)
	public ModelAndView addAppliedLeave(@ModelAttribute("userLeaveModel") UserLeaveModel userLeaveModel, BindingResult bindingResult) {
		System.out.println("Inside Applied Leave");
		if(bindingResult.hasErrors()) {
			System.out.println("ERROR !!!!!!!!!!!!!!!!");
			System.out.println(userLeaveModel);
			System.out.println("User id ::"+userLeaveModel.getUser().getUserId());
			System.out.println("Leave Id :: "+userLeaveModel.getLeave().getLeaveId());
		}
		ModelAndView mav = new ModelAndView("success");
		userLeaveServcice.saveAppliedLeave(userLeaveModel);
		return mav;
	}
}
