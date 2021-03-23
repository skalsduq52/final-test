package com.josso.electronicApproval;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class ElectronicApprovalController {

	@RequestMapping(value="electronicApproval", method = RequestMethod.GET)
	public ModelAndView mainPage(ModelAndView modelAndView) {	
		modelAndView.setViewName("electronicApproval/electronicApprovalMain");
		return modelAndView;
	}
}
