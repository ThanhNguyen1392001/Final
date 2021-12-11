<%@page import="model.Bean.Account"%>
<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>Đăng Nhập</title>
<link
	href="//maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css"
	rel="stylesheet" id="bootstrap-css">
<script
	src="//maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js"></script>
<script
	src="//cdnjs.cloudflare.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
<style type="text/css">
body {
	background-color: #5286F3;
	font-size: 14px;
	color: #fff;
}

.simple-login-container {
	width: 300px;
	max-width: 100%;
	margin: 50px auto;
}

.simple-login-container h2 {
	text-align: center;
	font-size: 20px;
}

.simple-login-container .btn-login {
	background-color: #FF5964;
	color: #fff;
}

a {
	color: #fff;
}
</style>
</head>
<body>
	<%
    Account ac = (Account) session.getAttribute("account");
    if (ac != null) {
        response.sendRedirect("Home.jsp");
    }
    %>
	<div class="simple-login-container">
		<h2>Login Form</h2>
		<form action="CheckLoginServlet" method="post">
			<div class="row">
				<div class="col-md-12 form-group">
					<input type="text" name="username" class="form-control"
						placeholder="Username">
				</div>
			</div>
			<div class="row">
				<div class="col-md-12 form-group">
					<input type="password" name="password"
						placeholder="Enter your Password" class="form-control">
				</div>
			</div>
			<div class="row">
				<div class="col-md-12 form-group">
					<input type="submit" class="btn btn-block btn-login" value="Login">
				</div>
			</div>
		</form>
	</div>
</body>
</html>