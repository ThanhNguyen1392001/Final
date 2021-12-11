<%@ page import = "model.Bean.Vacxin" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<%
		Vacxin vacxin = (Vacxin) request.getAttribute("vacxin");
	%>
	<form action="KiemTraSuaVacXinServlet" method="post">
		Ma Vacxin <input type = "text" name = "maVacxin" value = <%= vacxin.getMaVacxin()%> readonly = "true"><br>
		Ten Vacxin <input type = "text" name = "tenVacxin" value = <%= vacxin.getTenVacxin()%>><br>
		So Mui <input type = "text" name = "soMui" value = <%= vacxin.getSoMui()%>><br>
		Mo Ta <input type = "text" name = "moTa" value = <%= vacxin.getMoTa()%>><br>
		Gia Vacxin<input type = "text" name = "giaVacxin" value = <%= vacxin.getGiaVacxin()%>><br>
		Ten HangSX <input type = "text" name = "tenHangSX" value = <%= vacxin.getTenHangSanXuat()%>><br>
	<input type = "submit" value = "Sua">
	</form>
</body>
</html>