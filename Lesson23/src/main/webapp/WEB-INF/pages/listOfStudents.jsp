<%--
  Created by IntelliJ IDEA.
  User: m.biryukov
  Date: 22.10.2018
  Time: 20:25
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<table>
    <c:forEach var="student" items="${students}">
        <TR>
            <TD>${student.id}</TD>
            <TD>${student.name}</TD>
            <TD>${student.familyName}</TD>
            <TD>${student.age}</TD>
            <TD>${student.group}</TD>
        </TR>


    </c:forEach>
</table>
</body>
</html>
