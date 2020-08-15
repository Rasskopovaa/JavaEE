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
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css"
          integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
    <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/css/index.css">
</head>
<body>
<div id="dashboard-form">
Вы вошли как <%=request.getSession().getAttribute("login")%>
<a href="/login?action=logout"> Выйти </a>

    <% if (request.getSession().getAttribute("role").equals("teach")) {

    %>
    <div style=" font-family: 'Agency FB'; color: #000000" class="text"> Добавить ученика</div>

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

    <div style=" font-family: 'Agency FB'; color: #000000" class="text"> Добавить оценку</div>

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


    <div style=" font-family: 'Agency FB'; color: #000000" class="text"> Список студентов</div>
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
    <% if (request.getSession().getAttribute("role").equals("teach") || request.getSession().getAttribute("role").equals("stud")) {

    %>
    <div style=" font-family: 'Agency FB'; color: #000000" class="text"> Список оценок:</div>
<%
    List<Marks> listMarks = (List<Marks>) request.getSession().getAttribute("markList");
    for (Marks marks : listMarks) {
%>
<%=marks.getNameStud()%> /  <%=marks.getSurnameStud()%>  / <%=marks.getSubject()%> / <%=marks.getMarks()%>
<BR>
<% }
%>
    <% } %>
</div>
</body>
</html>
