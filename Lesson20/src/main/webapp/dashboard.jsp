<%--
  Created by IntelliJ IDEA.
  User: User
  Date: 01.08.2020
  Time: 19:16
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Страница ученика</title>
</head>
<body>
Вы вошли как <%=request.getSession().getAttribute("login")%>,
<h1> Регистрация прошла успешно!Выберите следующие действия:</h1>
<a href=""> Посмотреть оценки </a>
<a href="/login?action=logout">Выйти</a>
</body>
</html>
