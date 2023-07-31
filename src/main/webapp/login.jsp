<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Login</title>
<link rel="styesheet/css" href="./css/login.css">
</head>
<body>
<h1 >WELCOME TO TODO APP</h1>
<div class="form">
<h1 style="color:green">${pass}</h1>
<form action="" method="post">
<table>
<tr>
<th>Email:</th>
<th><input type="email" name="email"></th>
</tr>
<tr>
<th>Password:</th>
<th><input type="password" name="password"></th>
</tr>
<tr>
<th><button>Login</button>  </th>
<th><button type="reset"></button> Cancel </th>
</tr>
</table>
</form>
<a href="signup.jsp"> Create Account</a>
</div>
</body>
</html>