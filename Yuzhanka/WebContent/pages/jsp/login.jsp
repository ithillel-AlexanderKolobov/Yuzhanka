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

	<%
		user = service.findByEmail(request.getParameter("email"));
		out.println(service.findAll());//для отладки

		if (user != null && user.getPassword().equals(request.getParameter("password"))) {
			//session.setAttribute("user", user);
	%>
	<jsp:forward page="index.jsp"></jsp:forward>
	<%
		} else {
			user = null;
	%>
	Неправильный логин или пароль!

	<%
		}
	%>


</body>
</html>