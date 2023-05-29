<%--
  Created by IntelliJ IDEA.
  User: Diennguyenquang
  Date: 24/05/2023
  Time: 10:38 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<html>
<head>
    <title>Create a new employee</title>
</head>
<body>
<h1>Welcome, Enter The Employee Details</h1>

<form:form method="post" action="addEmployee" modelAttribute="employee">
    <table>
        <tr>
            <td>Employee ID</td>
            <td><form:input path="id"/></td>
        </tr>
        <tr>
            <td>Employee's name:</td>
            <td><form:input path="name"/></td>
        </tr>
        <tr>
            <td>Contact's number:</td>
            <td><form:input path="contactNumber"/></td>
        </tr>
        <tr>
            <td><input type="submit" value="Create"></td>
        </tr>
    </table>
</form:form>
</body>
</html>
