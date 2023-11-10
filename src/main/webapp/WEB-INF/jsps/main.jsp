<%--
  Created by IntelliJ IDEA.
  User: Vitaly
  Date: 03.11.2023
  Time: 16:31
  To change this template use File | Settings | File Templates.
--%>
<%--<%@ page contentType="text/html;charset=UTF-8" language="java" %>--%>
<%--<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>--%>
<%--<html>--%>
<%--<head>--%>
<%--    <title>Main</title>--%>
<%--</head>--%>
<%--<body>--%>
<%--Choose a quest:--%>
<%--<br>--%>
<%--<form method="get" action="game">--%>
<%--    <button type="submit" name="questName" value="AlienQuest">Alien Quest</button>--%>
<%--</form>--%>
<%--</body>--%>
<%--</html>--%>
<head>
    <link rel="stylesheet" type="text/css" href="../../css/main.css">

</head>
<body>
<nav class="nav-main">
    <div class="logo">WAlien Quest</div>
    <ul>
        <li>
            <input type="radio" name="nav-group" class="nav-option" id="home">
            <label for="home" class="nav-item">Quests</label>
            <label for="nav-close" class="nav-close"></label>
            <div class="nav-content">
                <div class="nav-sub">
                    <ul>
                        <li><a href="game?questName=AlienQuest">AlienQuest 1</a></li>
                    </ul>
                </div>
            </div>
        </li>
    </ul>
    <input type="radio" name="nav-group" id="nav-close" class="nav-close-option">
</nav>
<div class="content">

</div>
</body>
