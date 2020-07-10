<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<meta charset="utf-8">

  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>
     <link href="https://www.jqueryscript.net/css/jquerysctipttop.css" rel="stylesheet" type="text/css">
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bulma@0.8.2/css/bulma.min.css">
    <script defer src="https://use.fontawesome.com/releases/v5.3.1/js/all.js"></script>
    <script src="https://code.jquery.com/jquery-3.5.1.slim.min.js"
    integrity="sha256-4+XzXVhsDmqanXGHaHvgh1gMQKX40OUvDEBTu8JcmNs="
  crossorigin="anonymous"></script>
  
  </script>

    <script src="bulma-validator.js"></script>

      <script defer src="app.js"></script>
      <style>
        .section { margin: 150px auto; }
      </style>
</head>
<body>
<div align="center" style="width: 800px;height: 1000px;padding-left: 200px;padding-top: 150px;">
	<p style="color: green">${sucMsg}</p>
	<p style="color: red">${errMsg}</p>
	<h1 align="center">WELCOME TO CONTACT BOOK</h1>
	<form:form action="save" modelAttribute="Contact" method="POST">
		<table class="table">
			<tr>
				<td><label>NAME:-</label></td>
				<td><form:input path="contName" id="contName" class="form-control" /></td>
			</tr>
			<tr>
				<td><label>EMIAL:-</label></td>
				<td><form:input path="contEmail" id="contEmail" class="form-control"/></td>
			</tr>
			<tr>
				<td><label>MOBILE:-</label></td>
				<td><form:input path="contMobile" id="contMobile" class="form-control"/></td>
			</tr>
			<tr>
				<td><input type="reset" value="RESET"></td>
				<td><input type="submit" value="REGISTER"></td>
			</tr>

		</table>
	</form:form>
		<a href="fetch"><button>ALL CONTACT</button></a>
	</div>
</body>
</html>