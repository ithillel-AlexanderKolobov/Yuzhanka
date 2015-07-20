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
	<% if (request.getMethod().equalsIgnoreCase("post")) {
		
RoomType roomType = new RoomType(); 
roomType.setTitleOfType(request.getParameter("roomtype"));
ArrayList<Amenity> amenities = new ArrayList<>();
for(int i = 0; i < Amenity.values().length; i++) 
{
	if(request.getParameter( Amenity.values()[i].getName()) != null )
	{
		amenities.add(Amenity.values()[i]);
		 
	}
}
roomType.setAmenities(amenities); 

roomTypeService.save(roomType);%>
<jsp:forward page="rooms.jsp"></jsp:forward>

 <% } %>

	<form method="post" align="left" action="addroomtype.jsp">

		Тип комнаты <input type="text" name="roomtype"
			placeholder="Тип комнаты..." size="30">


		<% for(int i = 0; i < Amenity.values().length; i++) 
	{ %>

		<p>
			<input type="checkbox" name="amenity"
				value="<% Amenity.values()[i].getName();%>">
			<%= Amenity.values()[i].getName() %>
		</p>

		<%} %>

		<button type="submit" value="save">Сохранить</button>
	</form>
	



</body>
</html>