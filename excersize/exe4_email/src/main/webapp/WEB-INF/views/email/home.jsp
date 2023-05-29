<%--
  Created by IntelliJ IDEA.
  User: Diennguyenquang
  Date: 24/05/2023
  Time: 09:05 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>home Email </title>
</head>
<body>
<h1>EMAIL SETTING INFO</h1>
<table>
    <tr>
        <td>Language</td>
        <td>${email.language}</td>
    </tr>
    <tr>
        <td>pageSize</td>
        <td>${email.pageSize}</td>
    </tr>
    <tr>
        <td>spamsFilter</td>
        <td>${email.spamsFilter}</td>
    </tr>
    <tr>
        <td>signature</td>
        <td>${email.signature}</td>
    </tr>
</table>
<a href="/editSetting">edit</a>
</body>
</html>
