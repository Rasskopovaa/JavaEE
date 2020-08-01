<%@ page import="pojo.Student" %>
<%@ page import="java.util.List" %><%--
  Created by IntelliJ IDEA.
  User: User
  Date: 27.07.2020
  Time: 22:58
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Список студентов:</title>
</head>
<body>
<h3>New student</h3>
<form method="post">
    <label>Name</label><br>
    <input name="name"/><br><br>
    <label>Surname</label><br>
    <input name="surname"/><br><br>
    <label>Age</label><br>
    <input name="age" type="number" min="1"/><br><br>
    <label>City</label><br>
    <input name="city" type="number" min="1"/><br><br>
    <label>Contact</label><br>
    <input name="contact"/><br><br>
    <input type="submit" value="Save"/>
</form>

<%
    List<Student> list = (List<Student>) request.getAttribute("list");
    for (Student student : list) {
%>
<%=student.getSurname()%> <%=student.getName()%><%=student.getAge()%><%=student.getContact()%> <%=student.getCity()%>
<BR>
<%
    }
%>
</body>
</html>