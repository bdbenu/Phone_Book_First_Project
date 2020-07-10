<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1><p style="color: green;">${sucMsg}</p></h1>
<h1><p style="color: red;">${errMsg}</p></h1>
	<h1>HELLO THUSEF</h1>
	<form:form action="save" modelAttribute="Contact" method="GET">
	
		<table>
			<tr>
			<form:hidden path="contId"/>
				<td>NAME:-</td>
				<td><form:input path="contName"/></td>
			</tr>
			<tr>
				<td>EMIAL:-</td>
				<td><form:input path="contEmail"/></td>
			</tr>
			<tr>
				<td>MOBILE:-</td>
				<td><form:input path="contMobile" /></td>
			</tr>
			<tr>
				<td><input type="reset" value="RESET"></td>
				<td><input type="submit" value="REGISTER"></td>
			</tr>

		</table>
<a href="fetch">view all contact</a>
	</form:form>
</body>
</html>