<%--
  Created by IntelliJ IDEA.
  User: Vitaly
  Date: 24.10.2023
  Time: 18:50
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Game</title>
</head>
<body>
<form method="get" action="game">
    <c:out value="${requestScope.question}"/>
    <c:forEach items="${requestScope.variants}" var="variant">
        <br>
        ${variant}
        <br>
    </c:forEach>
</form>
</body>
</html>
