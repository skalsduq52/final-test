package com.josso.main;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.josso.main.vo.TestDao;
import com.josso.main.vo.User;

@Controller
public class MainController {
	
	@Autowired
	TestDao td;
	// 첫번쨰 최민재 커밋 2
	// 커밋 최민재 세번쨰
	// 혹시 안되는 사람 없쥬? 무야호~ 그만큼 신나신다는 거지
	// 가자가자 무야호
	// 나도 된다 - 수맹
	// d
	// 3월 24일 오전 9시 19분 - 최민재
	// TLqkf wha ehofk - dksxoalss

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
