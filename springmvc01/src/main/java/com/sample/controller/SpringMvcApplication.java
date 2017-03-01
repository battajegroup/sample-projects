package com.sample.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.sample.service.EmployeeService;

@Controller
@RequestMapping("/application")
public class SpringMvcApplication {

	@Autowired
	EmployeeService employeeService;

	@RequestMapping("/welcome")
	public ModelAndView helloWorld() {

		String message = "This hello message is set in servlet an returned to jsp for rendering.";
		return new ModelAndView("welcome", "message", message);
	}

	@RequestMapping("/employeeList")
	public ModelAndView hello() {

		String message = "This is Employee List";
		ModelAndView modelAndView = new ModelAndView("hello");

		modelAndView.addObject("message", message);
		modelAndView.addObject("allEmployees",
				employeeService.retrieveEmployees());

		return modelAndView;

	}
}