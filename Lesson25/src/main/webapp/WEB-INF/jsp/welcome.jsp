<!Doctype html>
<%@taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <!--
            <spring:url value="/css/main.css" var="springCss" />
        -->
    <c:url value="/css/main.css" var="jstlCss"/>
    <link href="${jstlCss}" rel="stylesheet">
</head>
<body>
<div class="myClass">
    <h1>Spring boot!!!</h1>
    <h2>data: ${message}</h2>
    Студент: ${student}
</div>
</body>
</html>