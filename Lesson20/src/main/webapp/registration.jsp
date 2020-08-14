<%--
  Created by IntelliJ IDEA.
  User: User
  Date: 07.08.2020
  Time: 1:08
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Регистрация</title>
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css"
          integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
    <link rel="stylesheet" type="text/css" href="css/index.css">
</head>
<body>
<%
    if (request.getSession().getAttribute("successRegister").equals(true)) {
%>
<div style="color:#AA0000">Регистрация пользователя <%=request.getSession().getAttribute("login")%> прошла успешно</div>
<%}%>
<div id="reg-form">
<form action="/inner/registration" method="post">
    <h4 style=" font-family: 'Agency FB'; color: #000000" class="text">Логин:</h4>
    <input type="text" name="login" id="login"><BR>
    <h4 style=" font-family: 'Agency FB'; color: #000000" class="text">Пароль:</h4>
    <input type="password" name="password" id="password"><BR>
    <h4 style=" font-family: 'Agency FB'; color: #000000" class="text"> Повторите пароль:</h4>
    <input type="password" name="password2" id="password2"><BR><BR>
    <h4 style=" font-family: 'Agency FB'; color: #000000" class="text">Кем вы являетесь?</h4>
    <select id="role" name="role">
        <option value="teach">Учитель</option>
        <option value="stud">Ученик</option>
    </select>
    <input type="submit"> <BR>
</form>
</div>
</body>
</html>
