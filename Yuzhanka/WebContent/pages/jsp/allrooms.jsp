<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Все номера</title>
<link rel="stylesheet" type="text/css" href="style.css" />
</head>
<body>
	<%@include file="header.jsp"%>
	<br>
	<br>
	<br>

	<div id="scrolldiv">
		Список всех номеров <br>
		<table>
			<tr>
				<%
					for (RoomType currentRoomType : roomTypeService.findAll()) {
				%>


				<tr><td><font size="6px"> <%=currentRoomType.getTitleOfType()%>
				</font></td>

				<td><img width=100
					src="<%=currentRoomType.getLinkToPhoto1()%>" alt="no image"></td>
				<td><img width=100
					src="<%=currentRoomType.getLinkToPhoto2()%>" alt="no image"></td>
				<td><img width=100
					src="<%=currentRoomType.getLinkToPhoto3()%>" alt="no image"></td>
				<td><img width=100
					src="<%=currentRoomType.getLinkToPhoto4()%>" alt="no image"></td>
				<td><img width=100
					src="<%=currentRoomType.getLinkToPhoto5()%>" alt="no image"></td>
				<td><a href="book.jsp<%="?roomtype=" + currentRoomType.getId()%>"><img
						width=100
						src="http://w-o-w.asia/wp-content/uploads/2011/10/Book-button1.jpg"></a></td>




				<td>
					<%
						for (Amenity amentity : currentRoomType.getAmenities()) {
								out.print(amentity.getName() + "/");
							}
					%>
				</td>
			</tr>



				<%
					}
				%>
			
		</table>
	</div>

</body>
</html>