<%--
  Created by IntelliJ IDEA.
  User: Diennguyenquang
  Date: 24/05/2023
  Time: 11:54 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
<head>
    <title>Login</title>
</head>
<body>
<h1>LOGIN</h1>
<form:form action="/user/login" method="post" modelAttribute="login">
    <fieldset>
        <legend>Login</legend>
        <table>
            <tr>
                <td><form:label path="account">Account:</form:label></td>
                <td><form:input path="account"  /></td>
            </tr>
            <tr>
                <td><form:label path="password">Password:</form:label></td>
                <td><form:input path="password"/></td>
            </tr>
            <tr>
                <td></td>
                <td><form:button >Login</form:button></td>
            </tr>
        </table>
    </fieldset>
</form:form>
</body>
</html>
