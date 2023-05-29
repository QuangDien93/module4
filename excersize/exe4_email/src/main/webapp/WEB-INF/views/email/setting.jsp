<%--
  Created by IntelliJ IDEA.
  User: Diennguyenquang
  Date: 24/05/2023
  Time: 08:22 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<html>
<head>
    <title>Setting</title>
</head>
<body>
<h1>SETTINGS</h1>
<form:form method="post" action="/setting" modelAttribute="email">
  <fieldset>
    <legend>Settings</legend>
    <table>
      <tr>
        <td>Languages</td>
        <td>
          <form:select path="language" items="${languages}"></form:select>
        </td>
      </tr>
      <tr>
        <td>PageSize</td>
        <td>
          Show <form:select path="pageSize" items="${pageSizes}" ></form:select> emails per page
        </td>
      </tr>
      <tr>
        <td>Spams Filter:</td>
        <td>
          <form:checkbox path="spamsFilter"></form:checkbox>
        </td>
      </tr>
      <tr>
        <td>Signature</td>
        <td><form:textarea  path="signature"></form:textarea></td>
      </tr>
      <tr>
        <td><input type="submit" value="Update"></td>
        <td><a href="/home">Cancle</a></td>
      </tr>
    </table>
  </fieldset>
</form:form>
</body>
</html>
