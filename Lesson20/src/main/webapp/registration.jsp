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
</head>
<body>
<%
    if (request.getSession().getAttribute("successRegister").equals(true)) {
%>
<div style="color:#AA0000">Регистрация пользователя <%=request.getSession().getAttribute("login")%> прошла успешно</div>
<%}%>
<form action="/inner/registration" method="post">
    Логин: <BR>
    <input type="text" name="login" id="login"><BR>
    Пароль: <BR>
    <input type="password" name="password" id="password"><BR>
    Повторите пароль:<BR>
    <input type="password" name="password2" id="password2"><BR><BR>
    <label>Кем вы являетесь?</label><BR>
    <select id="role" name="role">
        <option value="teach">Учитель</option>
        <option value="stud">Ученик</option>
    </select>
    <input type="submit"> <BR>

</form>
</body>
</html>
