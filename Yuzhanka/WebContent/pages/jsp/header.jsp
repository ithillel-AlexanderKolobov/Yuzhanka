<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>

<style type="text/css">
form {
	float: right;
}
</style>


</head>
<body><jsp:useBean id="user"
		class="org.hillel.it.yuzhanka.model.entity.User" scope="session" />
	<jsp:useBean id="service"
		class="org.hillel.it.yuzhanka.application.service.impl.UserServiceImpl"
		scope="application" />

	<jsp:useBean id="roomTypeService"
		class="org.hillel.it.yuzhanka.application.service.impl.RoomTypeServiceImpl"
		scope="application" />

	<jsp:useBean id="amenityService"
		class="org.hillel.it.yuzhanka.application.service.impl.AmenityServiceImpl"
		scope="application" />


	<%@page import="org.hillel.it.yuzhanka.model.entity.*"%>
	<%@page import="java.util.ArrayList"%>


	<ul id="menu">
		<li><a href="index.jsp">Главная</a></li>
		<li><a href="allrooms.jsp">Все номера</a></li>
		<li><a href="book.jsp">Забронировать</a></li>
		<li><a href="contacts.jsp">Контакты</a></li>
		<%
			if (user != null && !user.isAdmin()) {//сделать user.isAdmin()
		%>
		<li><a href="rooms.jsp">Комнаты</a></li>
		<li><a href="users.jsp">Пользователи</a></li>
		<li><a href="reservations.jsp">Резервы</a></li>
		<%
			}
		%>

	</ul>
	<br>

	<%
		if (user.getEmail() == null) {
	%>
	<form method="post" align="right" action="login.jsp">
		Логин <input type="text" name="email" placeholder="Ваш email.."
			size="10"> Пароль<input type="text" name="password"
			placeholder="Ваш пароль" size="10">
		<button type="submit">Войти</button>
		<a href="register.jsp">Регистрация</a>

	</form>
	<%
		} else {
	%>
	Здравствуй,
	<%
		out.println(user.getFirstName());
		}
	%>

</body>
</html>