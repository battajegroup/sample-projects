<?xml version="1.0" encoding="UTF-8" ?>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ page import="java.util.List"%>
<%@ page import="java.util.ArrayList"%>
<%@ page import="com.sample.model.Employee"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
<title>Insert title here</title>


<link type = "text/css" rel="stylesheet" href="/servletapi01/mycss.css" />
</head>
<body>

	<h3>Here servlet forwarded the call to jsp along with model data to render the page</h3>
	
	<h1>This is the Employee List table</h1>

	<%
		List<Employee> employeeList = (ArrayList<Employee>) request.getAttribute("employeeList");
	%>

	<table>
		<tr>
			<th>Employee Id</th>
			<th>First Name</th>
			<th>Last Name</th>
		</tr>

		<%
			for (Employee employee : employeeList) {
		%>

		<tr>
			<td><%=employee.getId()%></td>
			<td><%=employee.getFirstName()%></td>
			<td><%=employee.getLastName()%></td>
		</tr>

		<%
			}
		%>

	</table>

</body>
</html>