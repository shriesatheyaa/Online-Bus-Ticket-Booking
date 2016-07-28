<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
     <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
    <%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Login</title>
</head>
<body>
<!-- <form modelAttribute="user"action="UserLogin.html" method = "post">
<input type="text" path="name"/>
<input type="submit" value="Register" /></form>
-->
<center>
<br><br><br><br><br><br>

<br><br>
<c:url var="userRegistration" value="UserLogin.html"/>
<form:form modelAttribute="user" method="post" action="${userRegistration}">
<table width="400px" height="150px">
<tr>
<td><form:label path="id">id</form:label></td>
<td><form:input  path="id"/></td>
</tr>
<tr>
<td><form:label path="name">name</form:label></td>
<td><form:input  path="name"/></td>
</tr>
<tr>
<td><form:label path="email">email</form:label></td>
<td><form:input  path="email"/></td>
</tr>
<tr>
<td><form:label path="mobileNumber">mobileNumber</form:label></td>
<td><form:label path="mobileNumber"/></td>
</tr>
<tr>
<td><form:label path="password">password</form:label></td>
<td><form:input  path="password"/></td>
</tr>
<tr><td></td><td>
<input type="submit" value="Register" />
</td></tr>
</table>
</form:form>
<br>
</center>
</body>
</html>