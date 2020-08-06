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
Вы вошли как <%=request.getSession().getAttribute("login")%>,
<h1> Регистрация прошла успешно!</h1>

</div>


<% if (request.getParameter("role").equals("teach")) {

%>
<h3> Добавить ученика </h3>
<div id="1st_form" ${param.wasClicked?'hidden':''}>
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
</div>

<% } %>

<% if (request.getParameter("role").equals("teach")) {

%>
<h3> Добавить оценку </h3>
<div id="1st_form" ${param.wasClicked?'hidden':''}>
    <form method="post" id="second">
        <label>Name</label><br>
        <input name="name"/><br><br>
        <label>Surname</label><br>
        <input name="surname"/><br><br>
        <label>Subject</label><br>
        <input name="subject"><br><br>
        <label>Mark</label><br>
        <input name="mark" type="number" min="1"/><br><br>
        <input type="submit" value="Save"/>
    </form>
</div>
<% } %>

<% if (request.getParameter("role").equals("teach")) {

%>
<div id="1st_list" ${param.wasClicked?'hidden':''}>
    <h3> Список студентов</h3>
    <%
        List<Student> list = (List<Student>) request.getAttribute("list");
        for (Student student : list) {
    %>
    <%=student.getSurname()%> <%=student.getName()%><%=student.getAge()%><%=student.getContact()%> <%=student.getCity()%>
    <BR>
    <%
        }
    %>
    <%
        }
    %>

    <% if (request.getParameter("role").equals("stud")) {

    %>
</div>
<div id="2nd_list" ${param.wasClicked?'hidden':''}>
    <%
        List<Marks> listMarks = (List<Marks>) request.getAttribute("list");
        for (Marks marks : listMarks) {
    %>
    <%=marks.getId()%> <%=marks.getSubject()%><%=marks.getMarks()%>
    <BR>
    <%
        }
    %>
</div>
<% }
%>
</body>
</html>
