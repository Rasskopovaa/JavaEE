<%--
  Created by IntelliJ IDEA.
  User: User
  Date: 06.10.2020
  Time: 1:14
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form action="/addUser" method="post">
    <input type="text" name="login" placeholder="Введите логин" required autofocus/> <BR>
    <input type="password" name="password" placeholder="Введите пароль" required autofocus/> <BR>

    <input type="submit" value="Зарегистрироваться"/> <BR>


</form>


</body>
</html>
