<%--
  Created by IntelliJ IDEA.
  User: User
  Date: 31.07.2020
  Time: 20:08
  To change this template use File | Settings | File Templates.
--%>
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
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
Логин: <BR>
<form action="/login" method="post">
    <input type="text" name="login"><BR>
    Пароль: <BR>
    <input type="password" name="password"><BR><BR>
    <input type="submit">
    <input type="checkbox" name="option1" value="a2">Учитель<BR>
    <input type="checkbox" name="option2" value="a3">Ученик<BR>
    // если выбран учитель, кидаем на страницу регистрации
    и дальше на страницу с выбором действий, аналогичноо со студентом
</form>
</body>
</html>
