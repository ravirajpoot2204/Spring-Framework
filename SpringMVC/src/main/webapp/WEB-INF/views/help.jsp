<%@ page import="java.time.LocalDateTime"%>
<%@ page import="java.sql.Time"%>
<%@ page import="java.util.Date"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Help Page</title>
</head>
<body>
	<h1>Contact us for any query... Help Page</h1>
	<%
	String na = (String) request.getAttribute("name");
	Integer id = (Integer) request.getAttribute("id");
	String s = (String) request.getAttribute("St");
	LocalDateTime ti = (LocalDateTime) request.getAttribute("time");
	%>
	<h1>
		My name is :
		<%=na%></h1>
	<h1>
		My id is :<%=id%></h1>
	<br>
	<hr>
	<h4><%=s%></h4>
	<h2><%=ti%></h2>
</body>
</html>