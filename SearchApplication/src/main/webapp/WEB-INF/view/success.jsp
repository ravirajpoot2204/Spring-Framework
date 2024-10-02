<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@page isELIgnored="false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Welcome page after login page</title>
</head>
<body>
	<h1>Name : ${student.name}</h1>
	<h1>ID : ${student.id}</h1>
	<h1>DOB: ${student.dob}</h1>
	<h1>Courses: ${student.courses}</h1>
	<h1>City : ${student.address.city}</h1>
	<h1>State : ${student.address.state}</h1>
	<h1>Gender: ${student.gender}</h1>

</body>
</html>