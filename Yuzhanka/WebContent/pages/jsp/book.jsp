<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Южанка ждет вас</title>
<link rel="stylesheet" type="text/css" href="style.css" />
</head>
<body>
	<%@include file="header.jsp" %>


	<h1>Форма бронирования номера</h1>
	<form method="post" action="book.jsp">
	<select name="roomtypes">
	<option value="alltypes">Все типы</option>
		<% for(RoomType  currentRoomType : roomTypeService.findAll() )
		{%>
			<option value="<%=currentRoomType.getId()%>"<%if(request.getParameter("roomtype")!=null && request.getParameter("roomtype").equals(String.valueOf(currentRoomType.getId()))) 
	{
	out.print("selected");					
	}	
	%>> <%=currentRoomType.getTitleOfType()%></option>
		<%}%>
		</select>
	
	
	
	<%@include file="footer.jsp" %>

</body>
</html>