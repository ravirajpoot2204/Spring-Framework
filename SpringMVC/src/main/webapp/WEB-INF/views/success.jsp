<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ page isELIgnored="false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h2 class="text-center">${leader}</h2>

	<p class="text-center">${desc}</p>

<hr>
	<h1>Sign UP complete For ${user.username}</h1>
	<h1>Email : complete For ${user.email}</h1>
	<h1>Password ${user.password}</h1>
</body>
</html>