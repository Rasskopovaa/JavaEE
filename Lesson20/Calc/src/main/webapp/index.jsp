<%--
  Created by IntelliJ IDEA.
  User: User
  Date: 01.09.2020
  Time: 21:49
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>

<html>
<head>

    <title>The best calculator ever</title>
</head>
<body>

<form id="calculator" method="post" action="/calc">

    <input type="number" autocomplete=off name="first" id="first" value="${fn:escapeXml(param.first)}"> <BR><BR>
    <input type="number" autocomplete=off name="second" id="second" value="${fn:escapeXml(param.second)}"><BR><BR>
    <select id="sign" name="sign">
        <option value="+" ${param.sign == '+' ? 'selected' : ''}>+</option>
        <option value="-" ${param.sign == '-' ? 'selected' : ''}>-</option>
        <option value="*" ${param.sign == '*' ? 'selected' : ''}>*</option>
        <option value="/" ${param.sign == '/' ? 'selected' : ''}>/</option>
    </select>
    <input type="submit" value="=" oninput="result"><BR><BR>
    <output name="result">Result: ${result} </output>

</form>

</body>
</html>
