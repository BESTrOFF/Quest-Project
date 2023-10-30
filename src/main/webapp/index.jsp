<%@ page import="java.io.PrintWriter" %>
<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
    <title>Alien Quest</title>
</head>
<body>
<h1>Welcome to the Alien Quest!</h1>
<br>
<c:out value="${requestScope.message}"/>
<form method="get" action="login">
    <label>
        <input type="text" name="login" placeholder="login">
        <br>
        <input type="text" name="password" placeholder="password">
    </label>
    <br>
    <button type="submit" name="loginButton" value="get">Login</button>
    <button type="submit" name="registerButton" value="post">Register</button>
</form>
<br>
</body>
</html>