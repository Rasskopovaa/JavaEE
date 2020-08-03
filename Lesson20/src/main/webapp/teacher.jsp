<%--
  Created by IntelliJ IDEA.
  User: User
  Date: 03.08.2020
  Time: 23:02
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Страница учителя</title>
</head>
<body>
Вы вошли как <%=request.getSession().getAttribute("login")%>,
<h1> Регистрация прошла успешно!Выберите следующие действия:</h1>
<a href=""> Добавить ученика</a>
<a href=""> Добавить оценку</a>
</body>
</html>
