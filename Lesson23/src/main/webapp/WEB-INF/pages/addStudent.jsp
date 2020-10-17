<%--
  Created by IntelliJ IDEA.
  User: m.biryukov
  Date: 22.10.2018
  Time: 20:40
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form action="/addStudentUrl" method="post">
    <input type="text" name="studentName" placeholder="name"><br/>
    <input type="text" name="studentFamilyName" placeholder="surname"><br/>
    <input type="text" name="studentAge" placeholder="age"><br/>
    <input type="text" name="studentGroup" placeholder="group"><br/>
    <input type="submit">
</form>
</body>
</html>
