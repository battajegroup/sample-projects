package com.sample.servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.sample.model.Employee;
import com.sample.service.EmployeeService;

public class EmployeeServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public EmployeeServlet() {
		super();
	}

	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {

		response.setContentType("text/html");
		response.getWriter().append("<h1>").append("This is the Employee List")
				.append("</h1>");

		response.getWriter().append("<table style='border:1px solid black;'>");

		EmployeeService service = new EmployeeService();

		List<Employee> employeeList = service.retrieveEmployees();

		response.getWriter().append("<tr>");

		response.getWriter().append("<th style='border:1px solid black;'>")
				.append("Employee Id").append("</th>");
		response.getWriter().append("<th style='border:1px solid black;'>")
				.append("Employee First Name").append("</th>");
		response.getWriter().append("<th style='border:1px solid black;'>")
				.append("Employee Last Name").append("</th>");

		response.getWriter().append("</tr>");

		for (Employee employee : employeeList) {
			response.getWriter().append("<tr>");

			response.getWriter().append("<td style='border:1px solid black;'>")
					.append(employee.getId()).append("</td>");
			response.getWriter().append("<td style='border:1px solid black;'>")
					.append(employee.getFirstName()).append("</td>");
			response.getWriter().append("<td style='border:1px solid black;'>")
					.append(employee.getLastName()).append("</td>");

			response.getWriter().append("</tr>");

		}

		response.getWriter().append("</table>");
	}

	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {

		doGet(request, response);
	}

}
