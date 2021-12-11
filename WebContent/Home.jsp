<%@page import="model.Bean.Account"%>
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
    Account ac = (Account) session.getAttribute("account");
    if (ac == null) {
        response.sendRedirect("Login.jsp");
    }
    %>
    <h1 style = "color:red; text-align: center" >ADMIN HOME</h1>
	<div>
            <h2><a href = "ThemVacXinServlet">Tao moi mot loai vac xin</a></h2>
            <br>
            <h2><a href = "SuaVacXinServlet">Sua thong tin vac xin</a></h2>
            <br>
            <h2><a href = "form_search_by_request.php">Tim kiem thong tin vac xin</a></h2>
            <br>
            <h2><a href = "form_search_by_request.php">Liet ke lich su tiem phong</a></h2>
            <br>
            <h2><a href = "CapNhat.php">Thong ke tong so tien da tra</a></h2>
   	</div>
</body>
</html>