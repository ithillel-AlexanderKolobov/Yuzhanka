<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" type="text/css" href="style.css" />
</head>
<body>
<%@include file="header.jsp"%>
<%@page import="org.hillel.it.yuzhanka.model.entity.RoomType"%>




<br>Типы номеров: <br>
<table>
<% for(RoomType  currentRoomType : roomTypeService.findAll() )
{
	
	
	%>
	<tr>
	<td><%= currentRoomType.getTitleOfType() %></td>
	</tr>
	<%
}

%>
</table>

<form action="addroomtype.jsp">

<button value="addtype" name="addtype">Добавить тип</button>
</form> <br> <br>


<form action="addroom.jsp">
<button value="addroom" name="addtype">Добавить </button>
</form>



</body>
</html>