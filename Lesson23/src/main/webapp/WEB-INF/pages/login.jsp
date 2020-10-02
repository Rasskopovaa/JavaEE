<%--
  Created by IntelliJ IDEA.
  User: User
  Date: 02.10.2020
  Time: 0:22
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jstl/core" %>

<html>
<head>
    <title>Login.page</title>
</head>
<body>
<form action="/j_username_security_check" method="post">
    <c:if test="${not empty loginError}">
        <h3>Неверный логин или пароль</h3>
    </c:if>
    <h2> Вход в систему </h2>
    <input type="text" name="j_username" placeholder="Input ur name" required><BR>
    <input type="password" name="j_password" placeholder="Input ur password" required><BR>
    <input type="submit" value="login">

</form>
</body>
</html>
