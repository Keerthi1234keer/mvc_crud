 <%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1 >Signup page</h1>
<div class="form">
<form action="signup" method="post">
<table>
<tr>
<th>email:</th>
<th><input type="email" name="email"></th>
</tr>
<tr>
<th>Name:</th>
<th><input type="text" name="name"></th>
</tr>
<tr>
<th>Password:</th>
<th><input type="password" name="password"></th>
</tr>
<tr>
<th><button>create</button>  </th>
<th><button type="reset"></button> Cancel </th>
</tr>
</table>
</form>
<a href="login.jsp">back</a>
</div>
</body>
</html>