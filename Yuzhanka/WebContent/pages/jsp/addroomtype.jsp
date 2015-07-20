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
	<%
		Amenity[] amentity = Amenity.values();
		if (request.getMethod().equalsIgnoreCase("post")) {

			RoomType roomType = new RoomType();
			roomType.setTitleOfType(request.getParameter("roomtype"));
			ArrayList<Amenity> amenities = new ArrayList<>();

			for (int i = 0; i < amentity.length; i++) {
				if (request.getParameter(amentity[i].toString()) != null
						&& request.getParameter(amentity[i].toString()).equalsIgnoreCase("on")) {

					amenities.add(amentity[i]);

				}
			}
			roomType.setLinkToPhoto1(request.getParameter("url1"));
			roomType.setLinkToPhoto2(request.getParameter("url2"));
			roomType.setLinkToPhoto3(request.getParameter("url3"));
			roomType.setLinkToPhoto4(request.getParameter("url4"));
			roomType.setLinkToPhoto5(request.getParameter("url5"));

			roomType.setAmenities(amenities);

			roomTypeService.save(roomType);
	%>
	<jsp:forward page="rooms.jsp"></jsp:forward>

	<%
		}
	%>

	<form method="post" align="left" action="addroomtype.jsp">

		Тип комнаты <input type="text" name="roomtype"
			placeholder="Тип комнаты..." size="30">


		<%
			for (int i = 0; i < amentity.length; i++) {
		%>

		<p>
			<input type="checkbox" name="<%=amentity[i].toString()%>">
			<%=amentity[i].getName()%>
		</p>

		<%
			}
		%>
		<input type="text" name="numberofplaces" pattern="^[ 0-9]+$" > 

		<input type="text" name="url1"> <input type="text" name="url2">
		<input type="text" name="url3"> <input type="text" name="url4">
		<input type="text" name="url5">
		<br> <br>
		Кол-во спальных мест &nbsp&nbsp  <input type="text" name="numberofplaces" pattern="^[ 0-9]+$" size="1px" > 
		 <br>  <br>


		<button type="submit" value="save">Сохранить</button>
	</form>




</body>
</html>