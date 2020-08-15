<%--
  Created by IntelliJ IDEA.
  User: User
  Date: 31.07.2020
  Time: 20:08
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Авторизация</title>
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css"
          integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
    <link rel="stylesheet" type="text/css" href="css/index.css">
</head>
<body>
<%
    if ("wrongUser".equals(request.getParameter("action"))) {
%>
<div style="color:#AA0000">Неверное имя пользователя/пароль</div>
<%}%>
<%
    if ("noAuth".equals(request.getParameter("action"))) {
%>
<div style="color:#AA0000">Попытка получить доступ к закрытой части сайта. Сначала надо войти в систему</div>
<%}%>
<div id="avt-form">

    <form action="/login" method="post">
        <div style=" font-family: 'Agency FB'; color: #000000" class="text">Логин:</div>
        <input type="text" name="login"><BR>
        <div style=" font-family: 'Agency FB'; color: #000000" class="text">Пароль:</div>
        <input type="password" name="password"><BR><BR>
        <input type="submit"><BR>


    </form>
</div>
</body>
</html>
