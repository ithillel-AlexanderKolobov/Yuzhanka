<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Южанка ждет вас</title>
<link rel="stylesheet" type="text/css" href="style.css" />
</head>
<body>
	<%@include file="header.jsp"%>
	<jsp:useBean id="userLogin"
		class="org.hillel.it.yuzhanka.model.entity.User" scope="session" />
	<jsp:useBean id="serviceLogin"
		class="org.hillel.it.yuzhanka.application.service.impl.UserServiceImpl"
		scope="application" />
	<%
		userLogin = serviceLogin.findByEmail(request.getParameter("email"));		
		out.println(serviceLogin.findAll());//для отладки
		if (userLogin != null
				&& userLogin.getPassword().equals(
						request.getParameter("password"))) {			
			session.setAttribute("name", userLogin.getFirstName());
			out.println(userLogin.getFirstName());
	%>
	<jsp:forward page="index.jsp"></jsp:forward>
	<%
		} else {
	%>
	Неправильный логин или пароль!

	<%
		}
	%>


</body>
</html>