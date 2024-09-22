<%@page import="org.apache.jasper.tagplugins.jstl.core.ForEach"%>
<%@page import="java.util.List"%>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
	
	
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Home Page</title>
</head>
<body>
	<h1>this is home</h1>
	<h2>called by home Controller</h2>
	<h3>Url /home</h3>
	<hr>

	<%
	String name = (String) request.getAttribute("name");
	Integer id = (Integer) request.getAttribute("id");
	List<String> li = (List<String>) request.getAttribute("fr");
	String st= (String)request.getAttribute("St");
	%>
	<h1>
		The name is
		<%=name%></h1>
	<h1>
		The id is
		<%=id%>
	</h1>
	<h3>My Friends are :</h3>
	<% try{
	for (String s : li) {

		out.println("<h1><ul><li>" + s + "</h1></ul></li>");
	}
}catch(Exception e){
	out.println(e);
}
	
%>
<hr>
<h4><%= st %></h4>
</body>
</html>