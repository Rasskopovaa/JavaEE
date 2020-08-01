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
    <title>Title</title>
</head>
<body>
Вы вошли как <%=request.getSession().getAttribute("login")%>, <a href="/login?action=logout">выйти</a>
<h1> Dasboard! </h1>
</body>
</html>
