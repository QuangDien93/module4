<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: Diennguyenquang
  Date: 12/05/2023
  Time: 08:12 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Google translate </title>
</head>
<body>
<h1>Google translate</h1>
<form action="/translate">
    <span>English</span>
    <input type="text" name="english" value="${english}">
    <input type="submit" value="Translate">
    <c:if test="${vietnamese == null}">
        <p style="color: red"> NOT FIND !!!!!!!!!</p>
    </c:if>
    <c:if test="${vietnamese != null}">
        <span style="font-weight: bold">${vietnamese}</span>
    </c:if>


</form>
</body>
</html>
