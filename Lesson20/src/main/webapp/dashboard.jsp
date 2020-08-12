<%@ page import="pojo.Marks" %>
<%@ page import="pojo.Student" %>
<%@ page import="java.util.List" %><%--
  Created by IntelliJ IDEA.
  User: User
  Date: 01.08.2020
  Time: 19:16
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title> Журнал </title>
</head>
<body>
Вы вошли как <%=request.getSession().getAttribute("login")%>

<% if (request.getSession().getAttribute("role").equals(3)) {

%>
<h3> Добавить ученика </h3>

<form method="post" name="firstForm" id="first">
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

<h3> Добавить оценку </h3>

<form method="post" name="secondForm" id="second">
    <label>Name</label><br>
    <input name="nameStud"/><br><br>
    <label>Surname</label><br>
    <input name="surnameStud"/><br><br>
    <label>Subject</label><br>
    <input name="subject"><br><br>
    <label>Mark</label><br>
    <input name="marks" type="number" min="1"/><br><br>
    <input type="submit" value="Save"/>
</form>


<h3> Список студентов</h3>
<%
    List<Student> list = (List<Student>) request.getSession().getAttribute("studentList");
    for (Student student : list) {
%>
<%=student.getSurname()%> / <%=student.getName()%> / <%=student.getAge()%> / <%=student.getContact()%>
/ <%=student.getCity()%>
<BR>
<%
    }
%>
<%
    }
%>

<h3> Список оценок:</h3>
<%
    List<Marks> listMarks = (List<Marks>) request.getSession().getAttribute("markList");
    for (Marks marks : listMarks) {
%>
<%=marks.getNameStud()%> /  <%=marks.getSurnameStud()%>  / <%=marks.getSubject()%> / <%=marks.getMarks()%>
<BR>
<% }
%>
</body>
</html>
