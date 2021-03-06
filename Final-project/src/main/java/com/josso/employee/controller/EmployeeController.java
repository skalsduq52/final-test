package com.josso.employee.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.josso.employee.controller.model.dao.EmployeeDao;
import com.josso.employee.controller.model.service.EmployeeService;
import com.josso.employee.controller.model.vo.Employee;

@Controller
public class EmployeeController {
	
	@Autowired
	EmployeeService employeeService;
	
	@RequestMapping(value="employeeList.do", method = RequestMethod.GET)
	public ModelAndView employeeListService(ModelAndView modelAndView)throws Exception{
		
		List<Employee> employeeList = employeeService.selectEmployeeAll();
		modelAndView.addObject("employeeList",  employeeList); 
		modelAndView.setViewName("employee/employeeList"); 
		
		return modelAndView;	//modelAndView 객체에 데이터를 저장해서 리턴
		
	}
	@RequestMapping(value="employeeView.do", method = RequestMethod.GET)
	public String employeeViewService(@RequestParam("employeeNumber") String employeeNumber, Model model)throws Exception{
		
		Employee employee = employeeService.selectEmployee(employeeNumber);
		model.addAttribute("employee", employee);	//modelAndView와 달리 여기서 데이터를 저장
		
		return "employee/employeeView";				//보여줄 페이지만 리턴
	}
	@RequestMapping(value="employeeDelete.do", method = RequestMethod.GET)	
	//@GetMapping //@PostMapping 도 사용가능
	public ModelAndView deleteEmployee(Employee employee, ModelAndView modelAndView) throws Exception {
		 int cnt = employeeService.deleteEmployee(employee);
		 
		 modelAndView.addObject("cnt", cnt);
//		 System.out.println(cnt);
		modelAndView.setViewName("employee/employeeDeleteComplete");
		
		return modelAndView;
	}
	
	@RequestMapping(value="employeeInsert.do", method = RequestMethod.GET)
	public ModelAndView employeeInsertForm(Employee employee, ModelAndView modelAndView) throws Exception {
		System.out.println("employeeInsert.do get");
		modelAndView.setViewName("employee/employeeInsertForm");
		return modelAndView;
	}
	
	@RequestMapping(value="checkEmployeeNumber.do", method = RequestMethod.POST)
	public void checkEmployeeNumber(@RequestParam("employeeNumber") String employeeNumber, HttpServletResponse response) throws Exception {
		employeeService.checkEmployeeNumber(employeeNumber, response);
	}
	
	@RequestMapping(value="checkEmployeeEmail.do", method = RequestMethod.POST)
	public void checkEmployeeEmail(@RequestParam("employeeEmail") String employeeEmail, HttpServletResponse response) throws Exception {
		employeeService.checkEmployeeEmail(employeeEmail, response);
	}
	
	
	@RequestMapping(value="employeeInsert.do", method = RequestMethod.POST)
	public ModelAndView employeeInsert(Employee employee, ModelAndView modelAndView) throws Exception {
		int cnt = employeeService.insertEmployee(employee);
		modelAndView.addObject("cnt",cnt);
		modelAndView.setViewName("employee/employeeInsertComplete");
		System.out.println(cnt);
		return modelAndView;
	}
	@RequestMapping(value="employeeUpdate.do", method=RequestMethod.GET)
	public ModelAndView employeeUpdateForm(@RequestParam("employeeNumber") String employeeNumber,ModelAndView modelAndView) throws Exception{
		Employee employee = employeeService.selectEmployee(employeeNumber);
		modelAndView.addObject("employee", employee);
		modelAndView.setViewName("employee/employeeUpdateForm");
		return  modelAndView;
	}
	@RequestMapping(value="employeeUpdate.do", method=RequestMethod.POST)
	public ModelAndView employeeUpdate(Employee employee, ModelAndView modelAndView) throws Exception {
		int cnt = employeeService.updateEmployee(employee);
		modelAndView.addObject("cnt", cnt);
		modelAndView.setViewName("employee/employeeUpdateComplete");
		
		return  modelAndView;
	}
	
	//로그인 폼 이동
	@RequestMapping(value="index.do", method=RequestMethod.GET)
	public String loginForm() throws Exception{
//		System.out.println("loginform test");
		
		return "login/index";
	}
	
	//로그인
	@RequestMapping(value="login.do", method=RequestMethod.POST)
	public String login(@ModelAttribute Employee employee, HttpSession session, HttpServletResponse response) throws Exception {
		employee = employeeService.login(employee, response);
		session.setAttribute("employee", response);
		System.out.println("login test");
		
		
		return "index";
	}
	
	@RequestMapping(value="loginInfo.do, method=Request.GET")
	public Employee longinInfo(HttpSession session) throws Exception{
		Employee employee = (Employee) session.getAttribute("employee");
		return employee;
	}
}
	


