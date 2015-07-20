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
	<%@page import="org.hillel.it.yuzhanka.application.service.impl.*"%>
	<%@page import="java.util.List"%>
	
	<%
	
	//out.println(service.findAll().size());
		if (request.getMethod().equalsIgnoreCase("post")) {
			//user.setEmail(request.getParameter("email"));

			if (service.findByEmail(request.getParameter("email")) != null) {
				
				%>
				<font color="red">Такой email уже существует</font>
				<form method="post" action="register.jsp">
				

		<table>
			<tr>
				<td>Имя</td>
				<td><input type="text" name="name" value=<%=request.getParameter("name") %> required>
				</td>
			</tr>
			<tr>
				<td>Фамилия</td>
				<td><input type="text" name="surname"
					value=<%=request.getParameter("surname") %> required></td>
			</tr>
			<tr>
				<td>Отчество</td>
				<td><input type="text" name="patron"
					value=<%=request.getParameter("patron") %> required></td>
			</tr>
			<tr>
				<td>email@</td>
				<td><input type="text" name="email" value=<%=request.getParameter("email") %> required></td>
			</tr>
			<tr>
				<td>Придумайте пароль</td>
				<td><input type="text" name="password" placeholder="Пароль.." required>
				</td>
			</tr>
			<tr>
				<td>Повторите пароль</td>
				<td><input type="text" name="confirmpassword"
					placeholder="Повторите пароль" required></td>
			</tr>
			<tr>
				<td>Страна</td>
				<td><input type="text" name="country" value=<%=request.getParameter("country") %> required>
				</td>
			</tr>
			<tr>
				<td>Город</td>
				<td><input type="text" name="city" value=<%=request.getParameter("city") %> required>
				</td>
			</tr>
			<tr>
				<td>Адрес</td>
				<td><input type="text" name="adress" value=<%=request.getParameter("adress") %> required>
				</td>
			</tr>
			<tr>
				<td></td>
				<td align="right">
					<button type="submit" value="Go">Отправить</button>
				</td>
			</tr>
		</table>

	</form>
				
				<% 
			} else {

			user.setFirstName(request.getParameter("name"));
			user.setLastName(request.getParameter("surname"));
			user.setPassword(request.getParameter("password"));
			user.setPatronymic(request.getParameter("patron"));
			user.setEmail(request.getParameter("email"));
			user.setHomeAddress(request.getParameter("country") + " " + request.getParameter("city") + " " + request.getParameter("adress")); 
			service.save(user);
			}

		}
		else
		{
	%>
	<form method="post" action="register.jsp">

		<table>
			<tr>
				<td>Имя</td>
				<td><input type="text" name="name" placeholder="Ваше имя.." required>
				</td>
			</tr>
			<tr>
				<td>Фамилия</td>
				<td><input type="text" name="surname"
					placeholder="Ваша фамилия.." required></td>
			</tr>
			<tr>
				<td>Отчество</td>
				<td><input type="text" name="patron"
					placeholder="Ваше отчество" required></td>
			</tr>
			<tr>
				<td>email@</td>
				<td><input type="text" name="email" placeholder="..@gmail.com." required></td>
			</tr>
			<tr>
				<td>Придумайте пароль</td>
				<td><input type="text" name="password" placeholder="Пароль.." required>
				</td>
			</tr>
			<tr>
				<td>Повторите пароль</td>
				<td><input type="text" name="confirmpassword"
					placeholder="Повторите пароль" required></td>
			</tr>
			<tr>
				<td>Страна</td>
				<td><input type="text" name="country" placeholder="Страна" required>
				</td>
			</tr>
			<tr>
				<td>Город</td>
				<td><input type="text" name="city" placeholder="Город" required>
				</td>
			</tr>
			<tr>
				<td>Адрес</td>
				<td><input type="text" name="adress" placeholder="Адрес" required>
				</td>
			</tr>
			<tr>
				<td></td>
				<td align="right">
					<button type="submit" value="Go">Отправить</button>
				</td>
			</tr>
		</table>

	</form>

<%} %>

	<%@include file="footer.jsp"%>
</body>
</html>