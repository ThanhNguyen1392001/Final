<%@ page import = "model.Bean.Vacxin" %>
<%@ page import = "java.util.List" %>
<%@ page import = "java.util.ArrayList" %>
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
		List<Vacxin> vacxins = (ArrayList<Vacxin>)request.getAttribute("vacxins"); 
	%>
	<table border="1"  width="100%" style = "text-align: center">
		<caption>Danh sach vacxin</caption>
		<tr>
			<th>Ma Vacxin</th>
			<th>Ten Vacxin</th>
			<th>So Mui</th>
			<th>Mo Ta</th>
			<th>Gia Vac Xin</th>
			<th>Ten Hang SX</th>
			<th>Sua</th>
		</tr>
		<% 
			for (Vacxin v : vacxins) {
		%>
		<tr>
			<th><%= v.getMaVacxin()%></th>
			<th><%= v.getTenVacxin() %></th>
			<th><%= v.getSoMui() %></th>
			<th><%= v.getMoTa() %></th>
			<th><%= v.getGiaVacxin() %></th>
			<th><%= v.getTenHangSanXuat() %></th>
			<th><a href = "GetVacXinTheoMaVacXinServlet?maVacxin=<%= v.getMaVacxin()%>">xxx</a></th>
		</tr>
		<%
			}
		%>
	</table>
</body>
</html>