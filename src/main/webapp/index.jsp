<%@ page import="java.io.PrintWriter" %>
<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
    <title>Quests</title>
    <link rel="stylesheet" type="text/css" href="css/loginFon.css">
</head>
<body>
<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta3/dist/css/bootstrap.min.css"/>
<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.0.0-beta3/css/all.min.css">

<style>
    .form-container {
        background: rgba(129, 128, 128, 0.2);
        font-family: 'Nunito', sans-serif;
        padding: 40px;
        border-radius: 20px;
        box-shadow: 0 0 10px 10px rgba(0, 0, 0, 0.2);
    }

    .form-container .form-icon {
        color: #0E8505FF;
        font-size: 55px;
        text-align: center;
        line-height: 100px;
        width: 100px;
        height: 100px;
        margin: 0 auto 15px;
        border-radius: 50px;
        /*box-shadow: 7px 7px 10px #cbced1, -7px -7px 10px #fff;*/
    }

    .form-container .title {
        color: #efeff3;
        font-size: 25px;
        font-weight: 700;
        text-transform: uppercase;
        letter-spacing: 1px;
        text-align: center;
        margin: 0 0 20px;
    }

    .form-container .form-horizontal .form-group {
        color: #fff;
        margin: 0 0 25px 0;
    }

    .form-container .form-horizontal .form-group label {
        font-size: 15px;
        font-weight: 600;
        text-transform: uppercase;
    }

    .form-container .form-horizontal .form-control {
        color: #333;
        background: #ecf0f3;
        font-size: 15px;
        height: 50px;
        padding: 20px;
        letter-spacing: 1px;
        border: none;
        border-radius: 50px;
        /*box-shadow: inset 6px 6px 6px #cbced1, inset -6px -6px 6px #fff;*/
        display: inline-block;
        transition: all 0.3s ease 0s;
    }

    .form-container .form-horizontal .form-control:focus {
        /*box-shadow: inset 6px 6px 6px #cbced1, inset -6px -6px 6px #fff;*/
        outline: none;
    }

    .form-container .form-horizontal .form-control::placeholder {
        color: #808080;
        font-size: 14px;
    }

    .form-container .form-horizontal .btn {
        color: #fff;
        background: rgb(4, 6, 89, 0.8);
        font-size: 15px;
        font-weight: bold;
        text-transform: uppercase;
        width: 100%;
        padding: 12px 15px 11px;
        border-radius: 20px;
        /*box-shadow: 6px 6px 6px #cbced1, -6px -6px 6px #fff;*/
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

<div class="container-fluid">

    <div class="col-md-4 offset-md-4">
        <div class="form-container">
            <div class="form-icon"><i class="fa fa-user"></i></div>
            <h3 class="title">Login</h3>
            <form class="form-horizontal" method="post" action="login">
                <div class="form-group">
                    <label>Login</label>
                    <input class="form-control" type="text" name="login" placeholder="login">
                </div>
                <div class="form-group">
                    <label>password</label>
                    <input class="form-control" type="password" name="password" placeholder="password">
                </div>

                <button type="submit" class="btn btn-default" name="loginButton" value="get">Login</button>
                <br>
                <br>
                <button type="submit" class="btn btn-default" name="registerButton" value="post">Register</button>
            </form>
        </div>
    </div>

</div>
</body>
</html>