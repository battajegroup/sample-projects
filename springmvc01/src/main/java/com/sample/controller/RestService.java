package com.sample.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.sample.model.Employee;
import com.sample.service.EmployeeService;

@RestController
@RequestMapping("/service")
public class RestService {

	@Autowired
	EmployeeService employeeService;

	@RequestMapping(value = "/restapi/{name}", method = RequestMethod.GET)
	public String getGreeting(@PathVariable String name) {

		String result = "Hello "
				+ name
				+ ", This just shows the REST service returning just the string";

		return result;
	}

	@RequestMapping(value = "/restapi/employee/getAllEmployee", method = RequestMethod.GET, produces = "application/json")
	public List<Employee> getEmployee() {
		return employeeService.retrieveEmployees();

	}

}
