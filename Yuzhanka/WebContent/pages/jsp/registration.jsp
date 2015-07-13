<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%@page import="org.hillel.it.yuzhanka.application.service.impl.*" %>
<%@page import="java.util.List" %>
<jsp:useBean id="service" class="org.hillel.it.yuzhanka.application.service.impl.UserServiceImpl" 
scope="application"/>
<jsp:useBean id="user" class="org.hillel.it.yuzhanka.model.entity.User" 
scope="session"/>
<%
user.setEmail(request.getParameter("email"));
user.setFirstName(request.getParameter("name"));
user.setLastName(request.getParameter("surname"));
user.setPassword(request.getParameter("password"));
service.save(user);



%>

</body>
</html>