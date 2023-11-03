<%--
  Created by IntelliJ IDEA.
  User: Vitaly
  Date: 03.11.2023
  Time: 16:31
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Main</title>
</head>
<body>
Choose a quest:
<br>
<form method="get" action="game">
    <button type="submit" name="questName" value="AlienQuest">Alien Quest</button>
</form>
</body>
</html>
