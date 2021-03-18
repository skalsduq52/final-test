package com.osol.exam;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.osol.exam.vo.TestDao;
import com.osol.exam.vo.User;

@Controller
public class MainController {
	
	@Autowired
	TestDao td;

	@RequestMapping(value="main", method = RequestMethod.GET)
	public ModelAndView mainPage(ModelAndView modelAndView) {
		
		modelAndView.setViewName("main");
		return modelAndView;
	}
	
	@RequestMapping(value="test", method = RequestMethod.GET)
	public ModelAndView test(ModelAndView modelAndView) throws Exception {
		
		List<User> list = td.userList();
		modelAndView.addObject("list",list);
		modelAndView.setViewName("test");
		return modelAndView;
	}
}
