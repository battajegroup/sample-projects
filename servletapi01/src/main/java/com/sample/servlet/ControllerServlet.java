package com.sample.servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.sample.model.Employee;
import com.sample.service.EmployeeService;

public class ControllerServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public ControllerServlet() {
		super();

	}

	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {

		EmployeeService service = new EmployeeService();

		List<Employee> employeeList = service.retrieveEmployees();

		request.setAttribute("employeeList", employeeList);

		RequestDispatcher dispatcher = getServletContext()
				.getRequestDispatcher("/WEB-INF/employee.jsp");		
		
		dispatcher.forward(request, response);

	}

	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {

		doGet(request, response);
	}

}
