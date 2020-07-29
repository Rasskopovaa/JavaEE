<%--
  Created by IntelliJ IDEA.
  User: User
  Date: 25.07.2020
  Time: 16:46
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>$Title$</title>
</head>
<body>
<h1> Заголовок страницы</h1>
<p> Абзац текста </p>
<div>
    <a href="/hello"> Hello link </a> <BR>
    <a href="/iterator">Iterator link </a> <BR>
    <a href="/students">Students link </a> <BR><BR>
    <form method="post" action="/hello">
        <input type="text" name="testText">
        <input type="submit">
    </form>
    <h3>New student</h3>
    <form method="post">
        <label>Name</label><br>
        <input name="name"/><br><br>
        <label>Surname</label><br>
        <input name="name"/><br><br>
        <label>Age</label><br>
        <input name="age" type="number" min="1"/><br><br>
        <label>City</label><br>
        <input name="city" type="number" min="1"/><br><br>
        <label>Contact</label><br>
        <input name="contact"/><br><br>
        <input type="submit" value="Save"/>
    </form>
</div>
</body>
</html>
