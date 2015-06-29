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

	<form method="post">

		<table>
			<tr>
				<td>Имя</td>
				<td><input type="text" name="name" placeholder="Ваше имя..">
				</td>
			</tr>
			<tr>
				<td>Фамилия</td>
				<td><input type="text" name="surname"
					placeholder="Ваша фамилия.."></td>
			</tr>
			<tr>
				<td>email@</td>
				<td><input type="text" name="email" placeholder="..@gmail.com."></td>
			</tr>
			<tr>
				<td>Придумайте пароль</td>
				<td><input type="text" name="password" placeholder="Пароль..">
				</td>
			</tr>
			<tr>
				<td>Повторите пароль</td>
				<td><input type="text" name="confirmpassword"
					placeholder="Повторите пароль"></td>
			</tr>
			<tr>
				<td>Страна</td>
				<td><input type="text" name="country" placeholder="Страна">
				</td>
			</tr>
			<tr>
				<td>Город</td>
				<td><input type="text" name="city" placeholder="Город">
				</td>
			</tr>
			<tr>
				<td>Адрес</td>
				<td><input type="text" name="adress" placeholder="Адрес">
				</td>
			</tr>
			<tr>
				<td></td>
				<td align="right">
					<button type="submit">Отправить</button>
				</td>
			</tr>
		</table>

	</form>
</body>
</html>