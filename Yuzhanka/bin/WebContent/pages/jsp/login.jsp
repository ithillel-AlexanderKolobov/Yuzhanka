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
	<ul id="menu">
		<li><a href="index.jsp">Главная</a></li>
		<li><a href="allrooms.jsp">Все номера</a></li>
		<li><a href="book.jsp">Забронировать</a></li>
		<li><a href="contacts.jsp">Контакты</a></li>
		<li><a href="login.jsp">Войти</a></li>
	</ul>
	<form method="post" align="center">
		Логин <input type="text" name="name" placeholder="Ваш логин.."></br>
		</br> Пароль<input type="text" name="password" placeholder="Ваш пароль"></br>
		</br>
		<button type="submit">Войти</button>
		<a href="registation.jsp">Регистрация</a>
	</form>
</body>
</html>