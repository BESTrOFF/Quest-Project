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
    <link rel="stylesheet" type="text/css" href="../../css/game.css">
</head>
<body>
<style>
    .form-container {
        color: #fff;
        display: flex;
        justify-content: center; /* Центрирует элементы по горизонтали */
        align-items: center; /* Центрирует элементы по вертикали */
        height: 100vh; /* Задает высоту контейнера равной высоте видимой области страницы */
    }
    .form-container .form-horizontal .btn {
        color: #fff;
        background: rgb(4, 6, 89, 0.8);
        font-size: 15px;
        font-weight: bold;
        width: 200px;
        /*text-transform: uppercase;*/
        margin: 0 auto;
        padding: 12px 15px 11px;
        border-radius: 20px;
        border: none;
        transition: all 0.5s ease 0s;
    }

    .form-container .form-horizontal .btn:hover,
    .form-container .form-horizontal .btn:focus {
        color: #1A31A3FF;
        letter-spacing: 3px;
        box-shadow: none;
        outline: none;
    }
</style>
    <div class="col-md-4 offset-md-4">
        <div class="form-container">
            <form class="form-horizontal" method="get" action="game">
                <c:out value="${requestScope.question}"/>
                <br>
                <c:forEach items="${requestScope.variants}" var="variant">
                    <br>
                    ${variant}
                    <br>
                </c:forEach>
            </form>
        </div>
    </div>
</body>
</html>
