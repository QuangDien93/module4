<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: Diennguyenquang
  Date: 19/05/2023
  Time: 03:55 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Gia Vị đã chọn</title>
</head>
<body>
<h1>Các gia vị bạn đã chọn với SANDWICH là:</h1>
<c:forEach items="${condiment}" var="condiment">
<p>${condiment}</p>
</c:forEach>
</body>
</html>
