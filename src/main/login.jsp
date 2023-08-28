<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>


<!doctype html>
<html>
<head>
    <title>Login</title>
</head>
<body>
<h1>Login Form</h1>
<form method="POST" action="/login.jsp>">
    <label for="username">Username:</label>
    <input type="text" id="username" name="username"><br/>
    <label for="password">Password:</label>
    <input type="password" id="password" name="password"><br/>
    <input type="submit" value="Login">
</form>
<%
    String username = request.getParameter("username");
    String password = request.getParameter("password");

    if (username != null && password != null) {
        if (username.equals("admin") && password.equals("password")) {
            response.sendRedirect("/profile.jsp");
        }
    }
%>
</body>
</html>