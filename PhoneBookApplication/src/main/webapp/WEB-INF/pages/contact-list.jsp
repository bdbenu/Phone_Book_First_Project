<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1" isELIgnored="false"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>

<link href="https://cdn.jsdelivr.net/gh/xxjapp/xdialog@3/xdialog.min.css" rel="stylesheet"/>
<script src="https://cdn.jsdelivr.net/gh/xxjapp/xdialog@3/xdialog.min.js"></script>
<link rel="stylesheet" href="https://cdn.datatables.net/1.10.21/css/jquery.dataTables.min.css">
<script type="text/javascript" src="https://code.jquery.com/jquery-3.5.1.js"></script>
<script type="text/javascript" src="https://cdn.datatables.net/1.10.21/js/jquery.dataTables.min.js"></script>

<script>
    $(document).ready(function () {
        $('#table_id').DataTable();
    });
</script>

<script>


</script>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<script>

</script>
</head>
<body>
<a href="/save"> +Add New Contact</a>
	<table id="table_id" class="display" >
		<thead>
			<tr>
				<th>S NO.</th>
				<th>NAME</th>
				<th>EMAIL</th>
				<th>MOBILE</th>
				<td>OPERATION</td>
			</tr>
		</thead>

		
		<tr>
			<c:forEach items="${contacts}" var="c" varStatus="index">
				<td>${index.count}</td>
				<td>${c.contName}</td>
				<td>${c.contEmail}</td>
				<td>${c.contMobile}</td>
				<td><a href="edit?cid=${c.contId}">edit</a> &nbsp;<a
					href="delete?cid=${c.contId}" onclick="if (confirm('Are you sure to delete ..?')) commentDelete(1); return false">delete</a></td>
		</tr>
		</c:forEach>

	</table>
</body>
</html>