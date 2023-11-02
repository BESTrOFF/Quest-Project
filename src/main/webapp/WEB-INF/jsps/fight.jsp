<%--
  Created by IntelliJ IDEA.
  User: Vitaly
  Date: 02.11.2023
  Time: 18:04
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
This is fight

<form method="get" action="fight">
    <table>
        <tr><th>Enemy</th><th>HP</th></tr>
        <c:forEach items="${requestScope.enemies}" var="enemy">
            <tr><td>${enemy.getName()}</td>
            <td>${enemy.getHp()}</td></tr>
        </c:forEach>
    </table>
</form>
</body>
</html>
