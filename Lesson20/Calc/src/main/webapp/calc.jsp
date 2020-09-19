<%@ page import="pojo.Calculator" %>
<%@ page import="java.util.ArrayList" %>
<%@ page import="java.util.List" %><%--
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
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css"
          integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
    <link rel="stylesheet" href=" ${pageContext.request.contextPath} /css/style.css" type="text/css"/>
    <title>The best calculator ever</title>
</head>
<body>
<div id="calculator">
    <form method="post" action="/calc">

    <input type="number" autocomplete=off name="first" id="first" value="${fn:escapeXml(param.first)}"> <BR><BR>
    <input type="number" autocomplete=off name="second" id="second" value="${fn:escapeXml(param.second)}"><BR><BR>
    <select id="sign" name="sign">
        <option value="+" ${param.sign == '+' ? 'selected' : ''}>+</option>
        <option value="-" ${param.sign == '-' ? 'selected' : ''}>-</option>
        <option value="*" ${param.sign == '*' ? 'selected' : ''}>*</option>
        <option value="/" ${param.sign == '/' ? 'selected' : ''}>/</option>
        <option value="M" ${param.sign == 'M' ? 'selected' : ''}>M</option>
    </select>
    <input type="submit" value="=" oninput="result"><BR><BR>
        <output name="result">Result: ${result} </output>
        <BR><BR>

            <% List<Calculator> list = new ArrayList<>();
            list = (List<Calculator>) request.getSession().getAttribute("list");
            for (Calculator calculator : list) {
        %>
            <%=calculator.getNumber1()%>
            <%=calculator.getSign()%>
            <%=calculator.getNumber2()%> = <%=calculator.getResult()%> <BR>

            <%
            }
        %>


</div>
</form>

</form>
</div>
</body>
</html>
