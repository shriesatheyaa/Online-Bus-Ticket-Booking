<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!-- <!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
</head>
<body>
<center>
<br><br><br><br><br><br>
<div style="color: teal;font-size: 30px">Sign Up || Welcome</div>
<br><br>
<c:url var="userRegistration" value="saveUser.html"/>
<form:form  modelAttribute="user" method="post" action="${userRegistration}">
<table width="400px" height="150px">
<tr>
<td><form:label path="name">name </form:label> </td>
<td><form:input  path="name"/></td>
</tr>
<tr>
<td><form:label path="email">email</form:label></td>
<td><form:input  path="email"/></td>
</tr>
<tr>
<td><form:label path="mobileNumber">mobileNumber</form:label></td>
<td><form:input path="mobileNumber"/></td>
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
</html>-->
<!DOCTYPE html>
<html >
  <head>
    <meta charset="UTF-8">
    <title>Sign-Up/Login Form</title>
    <link href='http://fonts.googleapis.com/css?family=Titillium+Web:400,300,600' rel='stylesheet' type='text/css'>
    <link rel="stylesheet" href="css/style.css">
  </head>

  <body>
  <h1>Online Bus Ticket Booking</h1>

    <div class="form">
      
    <!--  <ul class="tab-group">
        <li class="tab active"><a href="#signup">Sign Up</a></li>
        <li
      </ul>
      
      <div class="tab-content" active="true">-->
        <div id="signup">   
          <h1>SIGNUP</h1>
          
          <c:url var="userRegistration" value="saveUser.html"/>
          <form:form  modelAttribute="user" method="post" action="${userRegistration}">
          
            <div class="field-wrap">
              <form:input path="name" type="text" placeholder="Enter Name" autocomplete="off" />
            </div>

          <div class="field-wrap">
            
            <form:input path="email" placeholder="Enter e-mail" type="email" autocomplete="off"/>
          </div>
          <div class="field-wrap">
            
            <form:input path="mobileNumber" placeholder="Enter mobile Number" type="text" autocomplete="off"/>
          </div>
          
          <div class="field-wrap">
            
            <form:input path="password"  placeholder="Enter password" type="password" autocomplete="off"/>
          </div>
          
          <button type="submit" class="button button-block"/>Get Started</button>
          
          </form:form>

        </div>
        
      </div><!-- tab-content -->
      
</div> <!-- /form -->
    
    
    
    
  </body>
</html>