package com.sample.service;

import java.util.ArrayList;
import java.util.List;

import com.sample.model.Employee;

public class EmployeeService {

	private List<Employee> employeeList = new ArrayList<Employee>();

	public EmployeeService() {

		Employee employee1 = new Employee();
		Employee employee2 = new Employee();
		Employee employee3 = new Employee();

		employee1.setId("1");
		employee1.setFirstName("John");
		employee1.setLastName("Peter");

		employee2.setId("2");
		employee2.setFirstName("Boss");
		employee2.setLastName("Admin");

		employee3.setId("3");
		employee3.setFirstName("Jim");
		employee3.setLastName("Tom");

		employeeList.add(employee1);
		employeeList.add(employee2);
		employeeList.add(employee3);

	}

	public List<Employee> retrieveEmployees() {

		return employeeList;

	}

}
