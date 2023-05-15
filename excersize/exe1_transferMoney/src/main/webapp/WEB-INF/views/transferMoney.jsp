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
    <title>TRANSFER MONEY</title>
</head>
<body>
<h1>TRANSFER MONEY</h1>
<form action="/transfer">
    <span>USD</span>
    <input type="number" name="usd" value="${usd}">
    <input  type="submit" value="Transfer">
    <input type="number" name="vnd" value="${vnd}">
    <span>VND</span>

</form>
</body>
</html>
